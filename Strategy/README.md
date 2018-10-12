# Strategy Design Pattern / Strateji Tasarım Şablonu
## Intent
 - Define algoritm family and encapsulate each one
 - Using this pattern you can use strategies interchangeably
 - It is also called Policy Pattern

 @startuml
 class Context
 interface Strategy
 class ConcreteStrategyA
 class ConcreteStrategyB
 
 Context *- Strategy
 ConcreteStrategyA ^-- Strategy
 ConcreteStrategyB ^-- Strategy
 @enduml
 
 
 
## Example

En basit hali ile **tasarım şablonları** çok yazılım geliştirme sürecinde yazılımcıların karşılaştığı ve yaygın olarak bilinen problemlerin çözümleridir.
Tasarım şablonları hatılaması kolay olması amacı ile gruplara ayrılmışlardır. Üç adet tasarım şablonu grubu var:

 - **Yaratımsal**
 - **Davranışsal**
 - **Yapısal**
