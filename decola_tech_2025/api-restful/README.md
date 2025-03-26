## class diagram

```mermaid

classDiagram
class Feature {
    -String icon
    -Number description
}

class Card {
    -String number
    -String limit
}

class News {
    -String icon
    -String description
}

User "1" *-- "1" Account
User "1" *-- "N" Feature
User "1" *-- "1" Card
User "1" *-- "N" News
```