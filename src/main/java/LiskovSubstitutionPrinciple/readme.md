# 里氏替换原则（Liskov Substitution Principle，LSP）
面向对象设计的基本原则之一

## 子类与父类的关系
1. 一
   - **子类必须能够替换父类**：子类对象可以替换父类对象，程序的行为不会发生变化。
   - **子类可以扩展父类功能，但不能改变父类原有的功能**。
   
   代码：[子类与父类的关系 - 计算器案例](/src/main/java/LiskovSubstitutionPrinciple/RequirementOne)

2. 二
   - **当子类的方法实现父类的抽象方法时，方法的后置条件（即方法的返回值）要比父类更严格。**
   
   代码：[子类与父类的关系 - 角色类案例](/src/main/java/LiskovSubstitutionPrinciple/RequirementTwo)

3. 三
   - **子类的实例可以替换任何父类的实例，但反之不成立。**
   
   代码：[子类与分类的关系 - 编程语言类](/src/main/java/LiskovSubstitutionPrinciple/RequirementThree)
   
## 异常处理
子类不能抛出比父类更严格的异常，除非这种行为是父类明确允许的。