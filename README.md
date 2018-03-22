# JavaExternal_06_03_2018

В данном файле будет описание домашних заданий и ссылки на классы с их решением.

# Java external

- [I. Lesson 1](#i-Lesson-1)
    - [1. Task 1](#1-Task-1)
    - [2. Task 2](#2-Task-2)
    - [3. Task 3](#3-Task-3)
- [II. Lesson 2](#i-Lesson-2)
    - [1. Task 1](#1-Task-1)
    - [2. Task 2](#2-Task-2)
- [III. Lesson 3](#i-Lesson-3)
    - [1. Task 1](#1-Task-1)
    - [2. Task 2](#2-Task-2)
    - [3. Task 3](#3-Task-3)
    
    
## I. Lesson 1

### 1. Task 1
[to contents](#java-external)

Используя циклы и метод: System.out.print("* "), System.out.print("  "), System.out.print("\n")
  
Выведите на экран: 
* прямоугольник [Rectangle.java](https://github.com/AndriiRomanenko/JavaExternal_06_03_2018/blob/master/src/lesson/one/task/one/Rectangle.java)
* прямоугольный треугольник [RightTriangle.java](https://github.com/AndriiRomanenko/JavaExternal_06_03_2018/blob/master/src/lesson/one/task/one/RightTriangle.java)
* равносторонний треугольник [EquilateralTriangle.java](https://github.com/AndriiRomanenko/JavaExternal_06_03_2018/blob/master/src/lesson/one/task/one/EquilateralTriangle.java)
* ромб [Rhombus.java](https://github.com/AndriiRomanenko/JavaExternal_06_03_2018/blob/master/src/lesson/one/task/one/Rhombus.java)

Класс [Main.java](https://github.com/AndriiRomanenko/JavaExternal_06_03_2018/blob/master/src/lesson/one/task/one/Main.java) для тестового запуска классов

### 2. Task 2
[to contents](#java-external)

Сортировка последовательности  
1. Упорядочить одномерный масиве вначале отрицательные повозрастанию
   затем положительные по убыванию. [SortingMinusPlus.java](https://github.com/AndriiRomanenko/JavaExternal_06_03_2018/blob/master/src/lesson/one/task/two/SortingMinusPlus.java)
2. В одномерном массиве сначала положительные потом отрицательные за О(n). [SortingPlusMinus.java](https://github.com/AndriiRomanenko/JavaExternal_06_03_2018/blob/master/src/lesson/one/task/two/SortingPlusMinus.java)

### 3. Task 3
[to contents](#java-external)

Дана целочисленная прямоугольная матрица. 
1. Упорядочить столбцы по убыванию среднего значения. [SortingColumnsByDescendingOrder.java](https://github.com/AndriiRomanenko/JavaExternal_06_03_2018/blob/master/src/lesson/one/task/three/SortingColumnsByDescendingOrder.java)
2. Упорядочить строки, по возрастанию по самой длинной серии одинаковых элементов. [SortingRowsByAscendingOrder.java](https://github.com/AndriiRomanenko/JavaExternal_06_03_2018/blob/master/src/lesson/one/task/three/SortingRowsByAscendingOrder.java)
3. Дана квадратная матрица A порядка M (M — нечетное число). Начиная с элемента A1,1 и перемещаясь по часовой стрелке, вывести все ее элементы по спирали: первая строка, последний столбец, последняя строка в обратном  порядке,  первый  столбец  в  обратном  порядке,  оставшиеся  элементы второй строки и т. д.; последним выводится центральный элемент 
матрицы. [Spiral.java](https://github.com/AndriiRomanenko/JavaExternal_06_03_2018/blob/master/src/lesson/one/task/three/Spiral.java)

## II. Lesson 2

### 1. Task 1
[to contents](#java-external)

Cоздать динамический массив из разных фигур и вывести информацию на экран. [FiguresArray.java](https://github.com/AndriiRomanenko/JavaExternal_06_03_2018/blob/master/src/lesson/two/task/FiguresArray.java)

### 2. Task 2
[to contents](#java-external)

Cоздать класс Polygon для описания фигур разной размерности. [Polygon.java](https://github.com/AndriiRomanenko/JavaExternal_06_03_2018/blob/master/src/lesson/two/task/Polygon.java)

Класс [Main.java](https://github.com/AndriiRomanenko/JavaExternal_06_03_2018/blob/master/src/lesson/two/task/Main.java) для запуска заданий

## III. Lesson 3

### 1. Task 1
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

### 2. Task 2
[to contents](#java-external)

1. Добавить машину [Амфибию](https://github.com/AndriiRomanenko/JavaExternal_06_03_2018/src/lesson/three/task/model/Amphibian.java),
 [БетМобиль](https://github.com/AndriiRomanenko/JavaExternal_06_03_2018/src/lesson/three/task/model/BatCar.java) и 3 интерфейса 
 [IFly](https://github.com/AndriiRomanenko/JavaExternal_06_03_2018/src/lesson/three/task/service/IFly.java), 
 [ISwim](https://github.com/AndriiRomanenko/JavaExternal_06_03_2018/src/lesson/three/task/service/ISwim.java), 
 [IMove](https://github.com/AndriiRomanenko/JavaExternal_06_03_2018/src/lesson/three/task/service/IMove.java)
2. Создать 3 последовательности  IFly, ISwim, IMove.
В рамках каждой последовательности упорядочить по скорости (методы Мин и Макс)

### 3. Task 3
[to contents](#java-external)

Добавить к механизмам детали


