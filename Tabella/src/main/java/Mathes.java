public class Mathes {
private int won;
private int lost;
private int drawn;

public Mathes(int aW,int aL,int aD)
{
	won = aW;
	lost = aL;
	drawn = aD;
}

public int EnterWon()
{
return won;
}

public int  EnterLost()
{
return lost;
}

public int  EnterDrawn()
{
return drawn;
}

public int CalculatePoints()
{
	return won*3 + lost*0 + drawn*1;
}

public int CalculateGoals()
{
	return won - lost;
}

//jak zmienie poni¿szy nawaias na { to tu wywala, ¿e jest ok, a wywala b³êdy ni¿ej w "public static void main(String[] args)", jak usunê ca³kowicie to wywala b³êdy w "public static void main(String[] args)"

}

{


Mathes Piast = new Mathes(14, 4, 3);
Piast.won = 14;
Piast.lost = 4;
Piast.drawn = 3;

int points1 = Piast.CalculatePoints();


Mathes Legia = new Mathes(12, 4, 3);
Legia.won = 12;
Legia.lost = 4;
Legia.drawn = 3;

int points2 = Legia.CalculatePoints();

}


//public
class First {
public static void main(String[] args)
{
new First();
}
public First()
{
Mathes Piast = new Mathes(12,4,3);
int points1 = Piast.CalculatePoints();

System.out.println("Iloœæ punktów: " +
'\n' + Piast.EnterWon()+ " , "+
Piast.EnterLost() + " , " +
Piast.EnterDrawn() + '\n' + "wynosi: " + '\n' +
points1);
}
}

//public
class Second {
public static void main(String[] args)
{
new Second();
}
public Second()
{
Mathes Legia = new Mathes(12,4,3);
int points1 = Legia.CalculatePoints();

System.out.println("Iloœæ punktów: " +
'\n' + Legia.EnterWon()+ " , "+
Legia.EnterLost() + " , " +
Legia.EnterDrawn() + '\n' + "wynosi: " + '\n' +
points1);
}
} 

//Trzeci

//public
class Third {
public static void main(String[] args)
{
new Third();
}
public Third()
{
Mathes ref1, ref2, ref3;
// utworzenie dwóch obiektów klasy Mathes
ref1 = new Mathes(1, 0, 0);
ref2 = new Mathes(0, 1, 0);
ref3 = ref1;

System.out.println("Iloœæ punktów dru¿yny Piast: " +
ref3.EnterWon()+ " , "+
ref3.EnterLost() + " , " +
ref3.EnterDrawn() + '\n' + "wynosi: " +
ref3.CalculatePoints());
ref3 = ref2;

System.out.println("Iloœæ punktów dru¿yny Legia: " +
ref3.EnterWon()+ " , "+
ref3.EnterLost() + " , " +
ref3.EnterDrawn() + '\n' + "wynosi: " +
ref3.CalculatePoints());
}
}


//Koniec 3



//doda³em nawias poni¿ej, bo wywala³o b³¹d

}

