```groovy
class MyClass {
    def myMethod(a, b) {
        if (a == null || b == null) {
            return null //This line is problematic
        }
        return a + b
    }
}

assert new MyClass().myMethod(1,2) == 3
assert new MyClass().myMethod(null,2) == null
```