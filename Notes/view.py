import datetime
import json

def checkId(fileName):

    data = read(fileName)
    if(type(data) != FileNotFoundError):
        max_id = 0
        for id in data:
            id = int(id)
            if(max_id < id):
                max_id = id
        return max_id
    else:
        print("Автоматически выдано id: 0")
        return 0



def read(fileName):
    try:
        with open(f'Notes\{fileName}', 'r', encoding="utf-8") as json_file:
            data = json.load(json_file)
            return data
    except FileNotFoundError as e:
        print(f"[FileNotFoundError]: No such file or directory, filename: {e.filename}")
        return e

        
def save(fileName: str, data: dict, id: int):
    try:
        oldData = read(fileName) 
        if(type(oldData) != FileNotFoundError):
            oldData[id] = data[id]
            with open(f'Notes\{fileName}', 'w', encoding="utf-8") as outfile:
                json.dump(oldData, outfile, ensure_ascii = False)
                print("Заметка сохранена")
        else:
            with open(f'Notes\{fileName}', 'w', encoding="utf-8") as outfile:
                json.dump(data, outfile, ensure_ascii = False)
                print("Заметка сохранена")
    except Exception as e:
        print(e)

def add():
    head = input("Введите заголовок записки: ")
    body = input("Введите тело записки: ")
    date = datetime.date.today()
    time = datetime.datetime.now()
    time = time.time().strftime('%H:%M:%S')
    id = checkId('data.json') + 1
    data = {}
    data[id] = []
    data[id].append({
        'head': head,
        'body': body,
        'date': str(date),
        'time': str(time)
    })
    save('data.json', data, id)
    



def edit(id: str, fileName: str):
    data = read('data.json')
    list = data[id]
    dict = list[0]

    try: 
        ans = int(input
("""Введите номер того, что вы хотите изменить:
1. Заголовок
2. Тело
Введите номер действия: """))
        if(ans == 1):
            
            head = input("Введите заголовок записки: ")
            date = datetime.date.today()
            time = datetime.datetime.now()
            time = time.time().strftime('%H:%M:%S')

            dict['head'] = head
            dict['date'] = str(date)
            dict['time'] = str(time)
            data[id] = []
            data[id].append(dict)
            save(fileName, data, id)
        

        elif(ans == 2):
            
            body = input("Введите записку: ")
            date = datetime.date.today()
            time = datetime.datetime.now()
            time = time.time().strftime('%H:%M:%S')

            dict['body'] = body
            dict['date'] = str(date)
            dict['time'] = str(time)
            data[id] = []
            data[id].append(dict)

            save(fileName, data, id)
        else:
            View(fileName)
    except ValueError:
        print('Вы ввели невалидные данные')
    
def RemoveNote(id: str, fileName: str):

    data = read(fileName)
    new_data = {}
    for i in range(1, checkId(fileName)+1):
        if(i != int(id)):
            if(i > int(id)):
                new_data[str(i-1)] = data[str(i)]
            else:
                new_data[str(i)] = data[str(i)]
    with open(f'Notes\{fileName}', 'w', encoding="utf-8") as outfile:
        json.dump(new_data, outfile, ensure_ascii = False)
        print("Заметка удалена")
    
def View(fileName: str):

    data = read(fileName)

    print()

    for id in data:
        list = data[id]
        dict = list[0]
        print(id + '. ' + dict['head'] + ' [' + dict['date'] + ', ' + dict['time'] + ']')
    
    try:
        ans = int(input("""
1. Выбрать по дате
2. Выбрать по номеру 
3. Добавить записку
4. Выйти

Введите номер действия: """))
        if ans == 1:
            ViewForDate(data, fileName)
            return True
        elif ans == 2:
            ViewForAns(data, fileName)
            return True
        elif ans == 3:
            add()
            return True
        elif ans == 4:
            return False
        
    except ValueError:
        print("Вы ввели невалидные данные")
    
    print()
 

def ViewForAns(data: dict, fileName: str):

    try:
        ans = int(input("Введите номер заметки: "))
        for id in data:
            if(str(ans) == id):
                list = data[id]
                dict = list[0]
                print(f'''
{dict['head']}

{dict['body']}

{dict['date']}, {dict['time']}''')
                
                second_ans = int(input("""
1. Изменить
2. Удалить
3. Отмена
Выберите номер действия: """))
                if(second_ans == 1):
                    edit(id, fileName)
                if(second_ans == 2):
                    RemoveNote(id, fileName)
                if(second_ans == 3):
                    View(fileName)
        View(fileName)

    except ValueError:
        print("Вы ввели невалидные данные")

            

def ViewForDate(data: dict, fileName: str):


    date = input("""Введите дату в формате: YYYY-MM-DD
>>> """)
    k = 1
    new_data = {}
    for id in data:
        list = data[id]
        dict = list[0]
        if(dict['date'] == date):
            new_data[str(k)] = data[id]
            print( str(k) + '. ' + dict['head'] + ' [' + dict['date'] + ', ' + dict['time'] + ']')   
            k += 1   
    if k > 1:
        ViewForAns(new_data, fileName)
    else:
        print("Записок с данной датой не найдено")
