```groovy
class MyClass {
    def myMethod(a, b) {
        return (a ?: 0) + (b ?: 0) // Use the Elvis operator for null safety
    }
}

assert new MyClass().myMethod(1,2) == 3
assert new MyClass().myMethod(null,2) == 2
assert new MyClass().myMethod(1,null) == 1
assert new MyClass().myMethod(null,null) == 0
```