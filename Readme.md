##Spring-boot-selenium


Basic annotation command explanantion

1. `@Component` this is class level annotation, these can called out in normal classes
2. `@Autowired` call the created component in project
3. `@Bean` create the class from third party libraries
4. `@Configuration` these class will be called first time
5. `@Preconstruct` these will be called after constructor creation
6. `@Predestroy` before terminate the object this method will be called
7. `@Value("${name:chrome}")` after colon is the default value, annotation used for reading value from application.properties fike
8. `@ConditionalOnProperty(name ="", havingvalue="")` if two bean present in same return type
9. `@ConditionalOnMissingBean` this method will consider for creation of beans if no matching found for the given parameters
10. `@ConditionOnExpression("${car.speed} >= 60")` based on racing condition given object class is created
11. `@Lazy` this annotation instantiate the object when the declared object is callable
12. `@Qualifier("name of bean with qualifier tag")"` is the alternate option to handle the bean initialisation
13. `-Dspring.profiles.active=chrome` pass any browser from cli
14. `@Primary` give preference to this bean
15. `@Profile` to handle the different environment with different properties


###Bean scope
1. Singleton(default)
2. Prototype