# JavaExternal_06_03_2018

В данном файле будет описание домашних заданий и ссылки на классы с их решением.

# Java external

- [I. Lesson 1](#i-lesson-1)
    - [Task 1](#i-task-1)
    - [Task 2](#i-task-2)
    - [Task 3](#i-task-3)
- [II. Lesson 2](#ii-lesson-2)
    - [Task 1](#ii-task-1)
    - [Task 2](#ii-task-2)
- [III. Lesson 3](#iii-lesson-3)
    - [Task 1](#iii-task-1)
    - [Task 2](#iii-task-2)
    - [Task 3](#iii-task-3)
- [IV. Lesson 4](#iv-lesson-4)
    - [Task 1](#iv-task-1)
    - [Task 2](#iv-task-2)
- [V. Lesson 5](#v-lesson-5)
    - [Task 1](#v-task-1)
- [VI. Lesson 6](#vi-lesson-6)
    - [Task 1](#vi-task-1)
    - [Task 2](#vi-task-2)
    
## I. Lesson 1

### Task 1
[to contents](#java-external)

Используя циклы и метод: System.out.print("* "), System.out.print("  "), System.out.print("\n")
  
Выведите на экран: 
* прямоугольник [Rectangle.java](https://github.com/AndriiRomanenko/JavaExternal_06_03_2018/blob/master/src/lesson/one/task/one/Rectangle.java)
* прямоугольный треугольник [RightTriangle.java](https://github.com/AndriiRomanenko/JavaExternal_06_03_2018/blob/master/src/lesson/one/task/one/RightTriangle.java)
* равносторонний треугольник [EquilateralTriangle.java](https://github.com/AndriiRomanenko/JavaExternal_06_03_2018/blob/master/src/lesson/one/task/one/EquilateralTriangle.java)
* ромб [Rhombus.java](https://github.com/AndriiRomanenko/JavaExternal_06_03_2018/blob/master/src/lesson/one/task/one/Rhombus.java)

Класс [Main.java](https://github.com/AndriiRomanenko/JavaExternal_06_03_2018/blob/master/src/lesson/one/task/one/Main.java) для тестового запуска классов

### Task 2
[to contents](#java-external)

Сортировка последовательности  
1. Упорядочить одномерный масиве вначале отрицательные повозрастанию
   затем положительные по убыванию. [SortingMinusPlus.java](https://github.com/AndriiRomanenko/JavaExternal_06_03_2018/blob/master/src/lesson/one/task/two/SortingMinusPlus.java)
2. В одномерном массиве сначала положительные потом отрицательные за О(n). [SortingPlusMinus.java](https://github.com/AndriiRomanenko/JavaExternal_06_03_2018/blob/master/src/lesson/one/task/two/SortingPlusMinus.java)

### Task 3
[to contents](#java-external)

Дана целочисленная прямоугольная матрица. 
1. Упорядочить столбцы по убыванию среднего значения. [SortingColumnsByDescendingOrder.java](https://github.com/AndriiRomanenko/JavaExternal_06_03_2018/blob/master/src/lesson/one/task/three/SortingColumnsByDescendingOrder.java)
2. Упорядочить строки, по возрастанию по самой длинной серии одинаковых элементов. [SortingRowsByAscendingOrder.java](https://github.com/AndriiRomanenko/JavaExternal_06_03_2018/blob/master/src/lesson/one/task/three/SortingRowsByAscendingOrder.java)
3. Дана квадратная матрица A порядка M (M — нечетное число). Начиная с элемента A1,1 и перемещаясь по часовой стрелке, вывести все ее элементы по спирали: первая строка, последний столбец, последняя строка в обратном  порядке,  первый  столбец  в  обратном  порядке,  оставшиеся  элементы второй строки и т. д.; последним выводится центральный элемент 
матрицы. [Spiral.java](https://github.com/AndriiRomanenko/JavaExternal_06_03_2018/blob/master/src/lesson/one/task/three/Spiral.java)

## II. Lesson 2

### Task 1
[to contents](#java-external)

Cоздать динамический массив из разных фигур и вывести информацию на экран. [FiguresArray.java](https://github.com/AndriiRomanenko/JavaExternal_06_03_2018/blob/master/src/lesson/two/task/FiguresArray.java)

### Task 2
[to contents](#java-external)

Cоздать класс Polygon для описания фигур разной размерности. [Polygon.java](https://github.com/AndriiRomanenko/JavaExternal_06_03_2018/blob/master/src/lesson/two/task/Polygon.java)

Класс [Main.java](https://github.com/AndriiRomanenko/JavaExternal_06_03_2018/blob/master/src/lesson/two/task/Main.java) для запуска заданий

## III. Lesson 3

### Task 1
[to contents](#java-external)

Создать абстрактный класс [CVehicle](https://github.com/AndriiRomanenko/JavaExternal_06_03_2018/src/lesson/three/task/model/Vehicle.java). На его основе реализовать классы 
[CPlane](https://github.com/AndriiRomanenko/JavaExternal_06_03_2018/src/lesson/three/task/model/Plane.java), 
[CCar](https://github.com/AndriiRomanenko/JavaExternal_06_03_2018/src/lesson/three/task/model/Car.java) и 
[CShip](https://github.com/AndriiRomanenko/JavaExternal_06_03_2018/src/lesson/three/task/model/Ship.java). Классы должны иметь возможность задавать и получать координаты,
 параметры средств передвижения(цена, скорость, год выпуска). Для самолета должна быть определена высота, для самолета и корабля - количество пассажиров. Для корабля - порт приписки.

Написать [программу](https://github.com/AndriiRomanenko/JavaExternal_06_03_2018/src/lesson/three/task/Main.java), создающую список объектов этих классов в динамической памяти. 
Программа должна содержать меню, позволяющее осуществить проверку всех методов классов.

1. Vehicle с наибольшей ценой 
2. Найти механизм год выпуска 2000-2005 со скоростью выше 150 км\ч, и наименьшей ценой
3. Из Масива Vehicle получить масив Car не старше 5 лет
4. Из Масива Vehicle получить масив Ship не старше 5 лет, с  отсортированой ценой по убыванию

### Task 2
[to contents](#java-external)

1. Добавить машину [Амфибию](https://github.com/AndriiRomanenko/JavaExternal_06_03_2018/src/lesson/three/task/model/Amphibian.java),
 [БетМобиль](https://github.com/AndriiRomanenko/JavaExternal_06_03_2018/src/lesson/three/task/model/BatCar.java) и 3 интерфейса 
 [IFly](https://github.com/AndriiRomanenko/JavaExternal_06_03_2018/src/lesson/three/task/service/IFly.java), 
 [ISwim](https://github.com/AndriiRomanenko/JavaExternal_06_03_2018/src/lesson/three/task/service/ISwim.java), 
 [IMove](https://github.com/AndriiRomanenko/JavaExternal_06_03_2018/src/lesson/three/task/service/IMove.java)
2. Создать 3 последовательности  IFly, ISwim, IMove.
В рамках каждой последовательности упорядочить по скорости (методы Мин и Макс)

### Task 3
[to contents](#java-external)

Добавить к механизмам детали

## IV. Lesson 4

### Task 1
[to contents](#java-external)

Сериализовать фигуры: 3 точки, 3 линии и 1 треугольник. При десериализации треугольника отобразить сколько обєктов

### Task 2
[to contents](#java-external)

Сделать 3 файла с сериализованным [Polygon](https://github.com/AndriiRomanenko/JavaExternal_06_03_2018/blob/master/src/lesson/two/task/Polygon.java)
, который будет описывать 3 разные фигуры. Так же десериализовать и отобразить на экран.

## V. Lesson 5

### Task 1
[to contents](#java-external)

Составить программу, отыскивающую проход по лабиринту.

Лабиринт представляется в виде матрицы, состоящей из квадратов. Каждый квадрат либо открыт,
либо закрыт. Вход в закрытый квадрат запрещен. Если квадрат открыт, то вход в него возможен со стороны, но не с угла.
Каждый квадрат определяется его координатами в матрице.
 
Программа находит проход через лабиринт, двигаясь от заданного входа.
После отыскания прохода программа выводит найденный путь в виде координат квадратов. Для хранения
пути использовать стэк.

## VI. Lesson 6

### Task 1
[to contents](#java-external)

Написать поисковый [сервис](https://github.com/AndriiRomanenko/JavaExternal_06_03_2018/blob/master/out/production/JavaExternal_06_03_2018/lesson/six/task/one/Handler.java). По указаному слову найти все URL упорядоченые по возрастанию частоты слова. Список из 20 ключевых слов.

### Task 2
[to contents](#java-external)

Создать [программу](https://github.com/AndriiRomanenko/JavaExternal_06_03_2018/blob/master/src/lesson/six/task/two/Converter.java) обработки текста. Преобразовать каждое слово в тексте, удалив из него все последующие (предыдущие) вхождения первой (последней) буквы этого слова.
