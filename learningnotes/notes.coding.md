# @Component
- The `@Component` annotation is used in the Spring Framework.
- It marks a class as a Spring bean.
- It can be applied to classes, interfaces, abstract classes, and methods.
- Spring manages the lifecycle of beans annotated with `@Component`.
- Beans are objects managed by the Spring IoC container.
- The `@Service`, `@Repository`, and `@Controller` annotations are specialized forms of `@Component`.
- They provide additional semantics for different types of beans.
- These annotations are meta-annotated with `@Component` and can be used interchangeably in most cases.

# @Autowired
- The `@Autowired` annotation allows Spring to automatically resolve and inject dependencies into a Spring bean.
- It can be applied to fields, constructors, or methods within a class.
- When `@Autowired` is used on a field, Spring will automatically inject an instance of the required dependency into that field.
- When used on a constructor, Spring will automatically instantiate the bean and provide the required dependencies as constructor arguments.
- Alternatively, `@Autowired` can be used on setter methods to inject dependencies.
- `@Autowired` can be used in conjunction with `@Qualifier` to specify a particular bean when multiple beans of the same type are present.
- In recent versions of Spring, the `@Autowired` annotation is no longer required for constructor injection if the class has a single constructor. Spring will automatically detect and use that constructor for dependency injection.
- `@Autowired` is a type of dependency injection in Spring, where the framework takes care of resolving and providing the required dependencies automatically.
