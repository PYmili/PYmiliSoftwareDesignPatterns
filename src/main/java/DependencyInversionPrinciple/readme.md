# 依赖倒置原则（Dependency Inversion Principle，DIP）
也称依赖反转原则，是面向对象设计（OOD）中比较重要、常见的一种。

## 原则
1. 高层模块不应该依赖于低层模块，两者都应该依赖于中间层。
2. 中间层不应该依赖于细节；细节应该由实现方自己处理。

开闭强调扩展和不修改（实现方式是抽象、接口），依赖倒置强调不依赖底层（实现方式也是抽象、接口）

## 案例
[DIP - 汽车租借](/src/main/java/DependencyInversionPrinciple)