# State Design Pattern / 
This is one of the important design patterns that type of Behavioral Pattern

## Intent
 - When object's internal state change then behavior of your object will change 
 - Polymorphism is used to change behavior of object 
 
![State Pattern uml diagram](https://github.com/necatiakbasoglu/Design-Patterns/blob/master/State/state.png)

**Context** : It uses state interface  
**IState** : Define and action to concrete states implement it  
**ConcreteState** : Implements interface actions 

## Example
First example for that is state of water. As you know water can be in there state
solid, liquid and gas. Default state of water is liquid when heat is increased then water state 
become gas so when heat is changed then state of water will change accordingly.

![Water States Pattern uml diagram](https://github.com/necatiakbasoglu/Design-Patterns/blob/master/State/waterStateUml.png)

## Output of source codes
![Output](https://github.com/necatiakbasoglu/Design-Patterns/blob/master/State/output.png)

# In Turkish
Durum Tasarım Şablonu bir nesnenin durumları değiştiği zaman kullanılabilir çok fazla if else blogu yazmak 
yerine bu şablonu kullanarak if else blogunu daha modular yapabiliriz.
Bu şablonun amacını genel olarak anlatmak gerekirse:
 - Nesnenin davranışına göre durumu değişir
 - Çok biçimlilik kullanılarak nesnenin davranışları değiştirilebilir.
## Örnek
Suyun halleri bu şablon için örnek verilebilir. Örneğin su akışkan iken ısıtılırsa gaz haline ve gas halinde
iken soğutulunca sıvı hale daha sonra katı hale gelir. Bu şekilde davranışa göre suyun durumu değişir.
 
## Programın Çıktısı
![Output](https://github.com/necatiakbasoglu/Design-Patterns/blob/master/State/output.png)
 
