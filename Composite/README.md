# Composite Design Pattern / Kompozit Tasarım Şablonu
## Intent
 - Compose objects recursively to show whole-part relationship.
 - Composition is done by recursive.
 
![Strategy Pattern uml diagram](https://github.com/necatiakbasoglu/Design-Patterns/blob/master/Composite/composite.png)

**Component** : It is an abstract class for leaf and composite
**Composite** : It has list of component. 
**Leaf** : It represents also component but it doesn't have any child.

## Example
Directory size can be a good example to this pattern. Imagine you have root directory which has many directory or file inside it
and you want to learn size of root directory. 

![Composite Pattern uml diagram](https://github.com/necatiakbasoglu/Design-Patterns/blob/master/Composite/directory.png)

# In Turkish
Structual(Yapısal) tasarım şablonu grubuna ait bir şablondur. Bütün ve parça arasındaki ilişkileri
modellemede kullanılır. Parçalar kendi içlerinde parçalardan oluşabilir buna örnek olarak klasör sistemini
verebiliriz. Klasörler kendi içlerinde klasörlerden ya da dosyalardan oluşabilir. Component interface ya da abstract class
olabilir bu seçim modele veya duruma göre yapılabilir. Klasör örneğinde bütün klasör parça ise klasör veya dosya olabilir.
## Örnek
Klasör sistemi örneğini ele alalım ve kök klasörün boyutunu döndüren bir program yazalım. Burada Component hem Dosya(File)
hem de Klasör(Directory) olabilir. Dosya(File) kendi içinde klasör tutmaz ve bu bizim aslında yaprağımızdır(Leaf). Klasör ise
klasör ve dosya tutabilir. Bu örnekte çok biçimlilik ve recursive kullanılarak dosya boyutu hesaplanıyor ve bunlar Nesne tabanlı
programlamanın olmazsa olmazlarıdır. 
 
## Programın Çıktısı
Size of Dir1 is 60  
Size of Dir2 is 90 
Size of Root is 210 
