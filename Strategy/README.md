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
By using this pattern you can add new algoritms easily or change existing one at run time 
without changing any code from context.

![Sort Strategy Pattern uml diagram](https://github.com/necatiakbasoglu/Design-Patterns/blob/master/Strategy/sort.png)

**Context** : It uses strategy interface
**ISortStrategy** : Define and action to concrete strategies implement it
**ConcreteStrategy** : Implements interface actions.  

## Output of source codes
![Output](https://github.com/necatiakbasoglu/Design-Patterns/blob/master/Strategy/output.png)

# In Turkish
## Örnek
Strateji tasarım şablonu için en iyi ve en basit örnek sıralama algoritmalarıdır.
Bu şablon kullanılarak Context class ının içeriğini değiştirmeden sadece ISortStrategy interface ini
genişleterek çalışma anında yeni sıralama algoritması çok kolay bir şekilde eklenebilir ya da 
var olan algoritma kolay bir şekilde 
değiştirelebilir. Bu şablonun amacını genel olarak
anlatmak gerekirse:
 - Bir algoritma ailesi tanımlar
 - Bu şablonu kullanarak stratejiler basitçe değiştirelebilip kullanılabilir
 - SOLID prensibinde bulunan Open/Closed prensibine uyar ve bu şablon ayrıca Poliçe şablonu olarak bilinir
 
## Programın Çıktısı
![Output](https://github.com/necatiakbasoglu/Design-Patterns/blob/master/Strategy/output.png)
 
