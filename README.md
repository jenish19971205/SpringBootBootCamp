# SpringBootBootCamp
## Lessons Learnt

### ❌ Never use @Autowired
- Instead of using `@Autowired`, I followed constructor-based dependency injection.
- It improves code readability, testability, and supports immutability.
- Spring automatically injects dependencies through the constructor when there is only one constructor, no need to use `@Autowired`.

### ✅ Why Constructor Injection is Better
- Easy to write unit tests using JUnit and mocking tools like Mockito.
- Makes required dependencies explicit (you know which dependencies are needed).
- No need for reflection, hence better performance.
- Promotes immutability — once the object is created, you cannot change the dependencies.

