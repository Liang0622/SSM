ssm整合步骤
    1.引入需要的jar
    2.创建ssm需要的各种配置文件
        01.spring  02.mybatis 03.springmvc
    3.配置 web.xml
    4.书写dao层  接口
    5.书写mapper
    6.书写service层
    7.书写controller

ssm中常用的注解以及作用

    1、dao
        daoImpl    @Repository   持久化层的组件注解
                        写在dao的实现类中，在mybatis中使用mapper来实现

    2、service
        serviceImpl  @Service   业务层的组件注解
            调用dao层的时候  有两种常用方式
        01.@Resource  写在属性或者set()方法上
                     默认是按照属性名称进行自动装配
        02.@Autowired  写在属性或者set()方法上
                     默认是按照属性类型进行自动装配
                     如果想按照名称使用 @Qualifier("userDao")

    3、controller  @Controller
        调用service层的时候  有两种常用方式
           01.@Resource  写在属性或者set()方法上
                          默认是按照属性名称进行自动装配
           02.@Autowired  写在属性或者set()方法上
                          默认是按照属性类型进行自动装配
                          如果想按照名称使用 @Qualifier("userService")

        @RequestMapping：匹配用户的请求路径 放在类上，或者某个方法上

        @PathVariable  :解析路径变量

        @RequestParma  ：请求参数和后台接收参数不一致

        @ExceptionHandler(异常类.class) 指定的异常进入
        @ExceptionHandler   默认是exceptio

        @InitBinder   controller类中所有的方法执行之前 执行！


    4、验证相关的注解  属于hibernate

        @NotNull 限制我们的输入不能是空
                 如果写在了数值类型上！ ""能转换成int
        @NotBlank 适用于String类型！可以去除默认的空格
        @NotEmpty 作用在集合中
        @Min
        @Max
        @Size
        @Patter

    5、AOP

        @Transaction  事务

        @AspectJ  定义切面

        @Before  之前
        @AfterReturning  后置增强
        @After    最终
        @AfterThrowing  异常
