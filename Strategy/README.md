# Strategy Design Pattern / Strateji Tasarım Şablonu
## Intent
 - Define algoritm family and encapsulate each one
 - Using this pattern you can use strategies interchangeably
 - It is also called Policy Pattern
 
![Strategy Pattern uml diagram](https://github.com/necatiakbasoglu/Design-Patterns/blob/master/Strategy/strategy.png)
 
## Example
One good example of that is sorting for strategy pattern suppose 
you have an integer array and you want to sort that array.
I implement two different sort algoritm insertion and bubble sort. 
By using this pattern you can add new algoritms easily with out changing any code from context.

![Sort Strategy Pattern uml diagram](https://github.com/necatiakbasoglu/Design-Patterns/blob/master/Strategy/sort.png)


## Output of source codes
![Output](https://github.com/necatiakbasoglu/Design-Patterns/blob/master/Strategy/output.png)
## Örnek
Strateji tasarım şablonu için en iyi ve en basit örnek sıralama algoritmalarıdır.
Bu şablon kullanılarak Context class ının içeriğini değiştirmeden sadece ISortStrategy interface ini
genişleterek yeni sıralama algoritması çok kolay bir şekilde eklenebilir. Bu şablonun amacını genel olarak
anlatmak gerekirse:
 - Bir algoritma ailesi tanımlar
 - Bu şablonu kullanarak stratejiler basitçe değiştirelebilip kullanılabilir
 - SOLID prensibinde bulunan Open/Closed prensibine uyar ve bu şablon ayrıca Poliçe şablonu olarak bilinir
 
