package TeorLesson1;

public class Teoriya {

	/*
	 * Шуйков Сергей Юрьевич

sshuykov@specialist.ru

Лабораторные работы на почту.

WiFi Pa$$w0rd

10266 (vimeo) примеры: https://goo.gl/MCYnQ4

Java 1 материалы: http://tinyurl.com/hpmwe7m
примеры: http://tinyurl.com/h6y2rb7

Java 2 материалы https://goo.gl/6GzzLQ
примеры : https://goo.gl/wCoan7

Xamarin: https://goo.gl/Zc3DXQ
Git материалы: https://goo.gl/ZV2LMx
примеры: https://goo.gl/bH8TW9


ТЕМА: Java ОСНОВЫ
    В Java НЕТ:
        1) указателей
        2) препроцессора
        3) освобождение памяти delete(memory) вместо этого Сборщик мусора
    
    В Java ЕСТЬ(ООП):
        1) Abstractuon
        2) Modularity
        3) Encapsulation
        4) Hierarchy
        5) Typing
        6) Concurrence
        7) Persistance
        
        Кросплатформенность
        
        Oracle купил Sun, чтобы продавать БД. Sun-имела много решений на Java
        
    Пример  программы на java:
        
        *.java ===========> *.class (byte code)-но это код ======> JVM(может весь класс файл забирать сразу и использовать в режиме JIT(Just-in-Time)-compale) или JVM берет часть кода .class и переводит в машинный код.
                AoT compile                     не отностится ни к одному процессору
                
        HotSpot(JVM) - может в процессе работы программы перекомпилировать части кода для оптимизации.
        
        JRE(Java Runtime Enveronment) = JVM + Standart_Packages
        
        Java 9.0.1
        
        JavaEE=JavaSE + Enterprise pack
        
        JavaTV
        JavaCard
        
        JDK = JRE + DevTools
        
        IDE:
            NetBeans (изначально разрабатывался SUN)
        
        НУЖНО:
            Java DOCS
            Java Overview
            Java Tutorial
            
        Имя пакета начинается с обратного DNS имени:
                ru.specialist.javase.pavel
                
        standart pack:
            java.swing;
            
        Настройка проекта:
            - перспектива(perspective)(JavaEE)
            
        Запуск *.class: 
        // Лоадер может использовать classpath
            java -classpath c:\Hello ru.specialist.hello.Programm  
        // Лоадер может загружать ZIP и JAR
        // Чтобы создать в JAR
        Проект->експорт JAR
        
ДЗ_№
    Написать простую пограмму запусть через командную строку
    Создать JAR, запустить его.
    
    
    Документация:
        Задокументировать можно:
            - пакет
            - класс
            - метод
            - поле

        
        Аннотация может быть: @since, @param, 
        Например :
                @depricated - указыват что использовать вместо, если класс, метод... устарел!
        
        Генерирование JavaDOCS:
                Eclipse->project->generate Java Docs
        
        Для пакета:
            src->(package-info.java)
        
ДЗ_№ Сгенерировать Java Doc для метода и класса
          
          
ТЕМА: Переменные
    stack
    STACK_SIZE
    _hello
    x
    
    static int a; - переменная на весь класс, 
                    она имеет одно и то же значение 
                    для всех обьектов данного класса
    
    Система типов:
            Простые типы:
                    int a;
                    
            Ссылочный тип данных:(используют обертки Integer)
                    String a;
            
            В Java нету структур, есть ссылочные типы и простые.
                Простые типы:
                    byte    signed 8bit 
                    int     signed 32bit
                    long    signed 64bit
                    boulean        1bit
                    float   32bit
                    double  64bit
                    char    16bit
                    
            Приведение типов Явное:
                long l=Long.MAXVALUE;
                //int x1=l;НЕЛЬЗЯ
                int y =6;
                l=(int)y; //МОЖНО
            
            Не явное приведение типов это:
                У типов есть обертки.
                    Integer t2 = t*2; //Integer -это ссылочный тип
                    
            Целочисленным переменным могут присваиваться 
                значения в других системах исчесления:
                    x=040; //это 32 в восмиричной
                    x=0x40; //это 64 d 16-тиричной
                
                Ввод может быть в любой системе, а вывод в десятичной
                
            Области видимости:
                1) Блок {}
                2) Тело метода
                3) Класс (методы класса имеют доступ ко всем его полям)
                    public static int a; // будет видна вне класса
   
   final b =11; //Присваивание только 1 раз, например задать условия задачи
   
   Константа:
   // Константе можно присвоить либо литералы либо константы
   public final static double PI = 3.14;
   public final static double PI2 = 2*PI; 
   
   Присваивание литералов:
        double d = 2.5;
        float f = 1.5F; // Если написать 1.5 то не скомпилируется
        
        
   Символьный тип:
        char ch = 'A';
        char ch2 = '\u004F'; // UNICOD
  
    Логические операторы:
        || // OR
        && // AND
        =! // NOT
        
    
	 */
}
