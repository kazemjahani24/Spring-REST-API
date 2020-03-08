package theory;

public class Theory {
	
	/*
	 
	  package theory;

public class theory2 {
	
	/*
	 * 
	 * package theory;

public class Theory {
	
	/*
	 1_ the first thing we need to do is to download the spring jar files
	 	we go to https://repo.spring.io/release/org/springframework/spring/
	 	then download the latest release. this website is basically the spring
	 	repository of all the spring versions. after clicking on that we will 
	 	be directed to another page and we download the spring-5.2.3.RELEASE-dist.zip
	 	  file. then we unzip it in the folder that we downloaded. then we  go to
	 	  the lib folder of this zip file then we will copy all the files from
	 	  there and then we will create a folder in the spring java project
	 	  that we created and call it lib, then will paste all the files 
	 	  in that folder. one more thing we need to do is we need to add the lib
	 	  folder to the class path of our eclipse project. we right click 
	 	  on the spring demo project and then we choose properties, then after 
	 	  that we will choose java build path. then there is a tap called 
	 	  libraries will appear then we choose classpath then we will choose 
	 	  add jars from the lib folder and add them all, then after that 
	 	  a  new file called refrence libraries will apear and that contains all 
	 	  the spring jars we added.
	 	  
	 	  
2_Inversion of Control(IoC):
	 			whenever there is talk of spring framework we always year about
	 			inversion of control.  it is basically the construction and 
	 			management of our objects.
	 			lets say we have an application  that make use of a coach like a baseball coach
	 			then the app will say hey baseball coach, give me a daily workout just to find
	 			out what type of daily workout i need to perform at practice. one thing that
	 			the managment team will say is that btw, the app should be configrable. so this
	 			app should work easily for a coach in another sport like tennis or football.
	 			so they want it to be configrable and work with any other type of coach. 
	 			
			 6_ Spring Inversion Of Control:
			Spring provides an object factory we can have our application
			talk to spring and say hey, give me an object based on the
			configuration file or annotation, then spring will give the
			appropriate implementation so then my app is configurable.
			
7_Spring container:
			primary functions:
				create and manage objects(Inversion of Control)
				Inject obejct's dependencies(dependancy injection)
				
			three ways for configuring spring container:
				XML configuration file(legacy, but most legacy apps still use it)
				Java Annotations(Modern)
				Java Source code(Modern)
			
		8_Spring Development Process
				1.Configure Spring Beans
					we will use xml configuration files and the id that we 
					give to it is the id and the java class name we will use in our
					 java code to retrieve the content of it and the class name is
					 the name of the class that we want that class to retrieve the
					 from that class.
					 
				2.Create Spring Container
					in spring world a spring container is known as the Application
					Context.
					Specialized implementations
						classPathXmlApplicationContext
						annotation configApplicationContext
						genericwebApplication 
						others
				3.Retrieve beans from Spring Container  
				
		9_now we will start writing some code and the first thing we need to do is 
		download source code file( spring and hibernate source code). then unzip it 
		and go to (spring core > spring demo one > starter files) then copy the applicationContext.xml
		and add it to our source directory(src) of our spring project.
		
		10_next we will create a new class called SpringHelloApp and make sure it is configured 
		and working of we add the classes that we want to it.
		
		11_next up we will check if the configuration is working and that means we check it if
		we change the bean in xml file or add another class and configure it.


12_Spring Dependency Injection:
	lets say for example i want to buy a car, to buy it then we will demand it from factory.
	and the factory has all the parts to build the car(tires, seats, other electronic stuff).
	so the essemblers will inject the engine, the tires, the seats and the electronic stuff in it.
	so this is what dependancy injection mean, we simply outsource the construction and 
	injection of our object to an external entity(the car factory).
	
	how this works in spring is that if we remember we have a spring object factory. so we
	retrieve an object like a coach object and this coach object might have some additional 
	dependancies. so  basically these dependancies are helper objects. so over all just like
	how i get a car to drive, in spring we get the objects ready to use.
	
	
	so lets say the coach provides daily workouts, and now the coach also provides daily 
	fortunes, this coach actully make use of a helper called FortuneService and that is 
	what a dependancy called. because a coach depends on a fortune service, in order to
	serve up the daily fortunes.
		
	Injection Types:
		constructor injection
			1_define dependancy interface and class
				1.1_now we will get to coding and  do the steps above.after 
				creating the classes and the interfaces, then we go to
				Coach interface and add our getDailyFortune method to it.
			12.2_create a constructor in our class(BaseBallCoach) for injections.
				2.1_ in the class above i need to define a private field and 
				then define a constructor.after doing the steps above, we need to
				add our dependency injections in our .xml file.
				after that we will go to our class(HelloSpringApp) and call the new
				method which we created for fortune.now our trackCoach can use fortuneService too
				 so we go to the trackCoach Class and then add our private field and the cons
				 tstructor to the class and then we will add the injections in the .xml file for
				 the class trackCoach too.
				
				12.3_configure the dependency in spring config file.
			
			
			
		12.4_setter injection
			with setter injections, spring will inject the dependencies 
			by calling on our class(Create a new class called CricketCoach).
					12.4.1_first we need to create the setter methods in our 
					class(CricketCoach and add the Coach interface to it too) for injection
					then we need to configure the dependency in the spring configuration file.
					12.4.2_next we will cofigure the dependency in our spring configuration
					file(.xml).
					
					12.4.3 next we will create new class(SetterDemoApp) just to read the  spring
					configuration file and perform some operations
					
				
13_Spring Bean scopes and lifeCycle
	a scope refers to the lifecycle of a bean.it tells us how long does the bean live.
	how many instances are created, and how is the bean shared in the spring enviroment.
	 the default scope for a bean is singleton. what singleton mean is that spring container
	 only creates only one instance of the bean  by default
	 and it is cached in the memory.and basically there is only one bean and everyone with
	 everyone who request that bean(check the folder called pictures in the folder of spring bean scopes).
	 if we specify the bean scope to prototype, then each time we request, then a new object
	 is created. the prototype is good to keep track of stateful data. so every time 
	 we see prototype we think of new keyword, it creates a new bean for each request for tha
	 component or that object.
	 		13.1_next we go to eclipse and write some code for singleton and
	 		prototype. and for that we will create a new ApplicationContext.xml file(BeanScope-applicationContext)
			then after that we will create a new class called BeanScopeDemoApp.java
			
			13.2 now we will talk about bean life-cycle methods.  what we can do it we can
			add our own custom methods, what that means is that we can add our own codes
			make that happen during bean initialization.we can do something similar when a bean
			is destroyed.
				steps to do the things we want in our methods:
					13.2.1_define our methods for init and destroy(we will use Track.java class)
							after completing the methods above,we will create the new 
							config file and name it beanLifeCycle-applicationContext.xml
							and use that bean for our init and destroy method.
					13.2.1.1_then we will copy the class of BeanScopeDemo and then we will
							paste it in the same directory of the BeanScopeDemoApp.
							
							
					13.2.2_configure the method names in spring config file.
					
				
14_Spring Configuration with Java Annotations:
	Java annotations are simply labels or markers added to java classes and they give us
	meta-data about the class for example for a shoe we have color, size, we have style and code
	these specifications and meta-data for and for java  class meta-data is annotations.
	an example of annotation is @override. 
	so why do we  need annotations if we have XML configuration?to answer that lets if we do
	normal xml configuration it can be verbose(too many words) for very large porjects.lets say
	we have a spring project where we have 30 or 100 beans in it, and we had to config each one
	of them in our config file.so to overcome that we can config our spring beans with annotations
	so basically annotaion will allow us to minimize the xml configuration.so once we add 
	annotation to our class, then spring will actually scan our java classes for those
	annotations, when it finds a class that has a special annotation, it will automatically
	register that bean with the spring container. so instead of doing everything long hand
	via xml config file, spring will just scan and say  oh that's spring bean, it will grab 
	that bean and registers it with the spring container.spring will help us here and does
	a lot of things in the background for us by scanning our class.
			14.1_Development process using annotations with spring.
				14.1.1_Enable component scanning in spring config file.
				14.1.2_ add @Component Annotation in the java class
				14.1.3_ Retrive Bean from Spring Container, and for this 
						part we will create a new class(AnnotationDemoApp)
			14.2_Spring Dependancy injection with Annotation and autowiring.
			for denedency injection, spring can autoatically wire up our
			objects together. so what will happen is that spring will
			look for a class that matches the given porpety. and it actually
			matches by type and the type coulf be either class or
			interface. once the spring finds a match then it will
			automatically inject it and this called autowired.
			so what we will do is we will inject a FortuneService
			into a Coach implementation. so what happens beind the 
			seens is that spring will scan all the components
			and it wants to satisfiy a dependency and i need to
			inject a FortuneService. so spring will ask is there 
			anyone out there that implements the FortuneService interface?
			if so then spring will grab that component or bean 
			and inject it. and the autowiring there is three types of injections:
				14.2.1_Constructor Injection:
						14.2.1.1_define the dependency interface(FortuneService) and class(HappyFortuneService)
								and then we will add a new method to our Coach interface which is getDailyFortune();
								and then we go to our tennisCoach Class and add our umimplemented method and 
								add a private field(ForutuneService) in our TennisCoach Class and use it in getDailyFortune Method in the same class below it 
						14.2.1.2_create a constructor in the class(TennisCoach class) and then we will go o to
								 the class(AnnotationDemoApp) and call the method(getDailyFortune) and print it
						14.2.1.3_configure the dependency injection with @Autowired Annotation in our(TennisCoach class)
						
				14.2.2_Setter injection
						with this type of injection
						we inject depenencies by calling setter methods on our class(TennisCoach)
						14.2.2.1_ we create setter methods. and then when this step is done
						we go to our main class(AnnotationDemoApp) and run the application
						*one thing to note here is that we can inject our dependency on any
						*method and not just the setter method by only simply adding the @Autowired Annotation
						*on top of that method.
						14.2.2.1_ configure the dependancy injection with @Autowired Annotation		 
				14.2.3_Field Injections
						with field injections we can inject depedencies by setting field 
						values on our class directly(even private fields)and this happens
						behind the seens using some java technologies called Reflection
						14.2.3_the development process is we configure the dependeny injection
						with wired annotation:
							applied directyl to the field 
							no need for setter methods.
		
		14.3_Bean scope with annotation:
			scope of the bean says how long the bean lives, how many instances are created 
			and how is the bean shared. and the default scope for all the beans is singleton
			and singleton means spring container creates only one instance od the bean by 
			default.it is cached in memory and all the requests for the bean will return 
			a shared referance to the same bean. to understand the concept of scope betrer
			we will create a new class(AnnotationBeanScopeDemoApp ) and write some code
			in it to have a better understanding of the code. we tried the singleton(we didnt have to change anything or use any notation for singleton becassye it is the default one and it automatically uses this one)
			and we will try prototype, by adding scope annotation(@scope("prototype")) in our TennisCoach class
			
			14.3.1_Bean lifecylce with annotation methods/hooks:
				we remember that we can add custom code during th been initialization
				and we can also add custom code during the bean destruction. and the
				process is very basic and we only need to:
					define our init and destroy methods(in TennisCoach class) and next we add out
					@PostConstruct(this means that the method below that annotation
					will be executed after the bean is constructed ) and @PreDestroy(and the method below this annotation is executed bfore the
					bean is destroyed) annotations to those methods and then we go to our
					AnnotationBeanDemoApp and run that class
					
					
		15_Spring Configuration with java code:
		so instead of cofiguring spring container using xml, we will use java source code 
		and thus we will not need xml file to configure our code. and steps are as below:
			15.1_ create a java class()SportConfig and annotate as @configuration
			15.2_ Add component scanning support:@ComponentScan(optional)
					then copy AnnotationDemoApp and paste it in the same package
					and then change the name of it to JavaConfigDemoApp
			15.3_read spring java configuration class from other class(JavaConfigDemoApp)
			15.4_retrieve bean from spring container
			
			
			15.5_Defining beans using java codes(before starting the steps below,first we will define two new classes called SwimCoach and SadFortuneService).:
				15.5.1_ define method to expose bean(@Bean defines a bean)
				15.5.2_ inject bean depedencies
					after doing 15.5.1_ and 15.5.2_, we will copy the JavaConfigDemoApp
					and paste it and change its name to SwimJavaConfigDemoApp
			15.5.2.1_first we will create file called sport.porperties in the src folder 
					of the other classes for this topic are there
					next we will load the properties file in spring config(SportConfig.java) and add @propertyResource file.
					next we will refrence the values from the properties file and for that we will go to SwimCoach Class
					and define two fields and inject them accordingly(we will make use of
					@value annotation for that ). and to make use fo those new fields we will have to generate some getter methods.
					then we will move to our main program(SwimJavaConfigDemoApp)
					and make some modfications there.(change Coach.class to SwimCoach.class )
					
					
				15.5.3_Read spring java configuration class
				15.5.1_retrivie bean from spring container
				
				
				
		16_Spring MVC:
					it is a framework for building web applications in java
					based on model-view-controller design pattern
					Leverages of the core Spring framework(IoC, DI)
					which means everything we have learned  so far we will
					apply in spring MVC. the benefits of learing mvc are:
						Spring way of building web app UIs in java
						Laverage a set of reuseable UI components
						help manage applciation state for web requests
						process form data: validation, conversion etc
						flexible configuration for the view layer
						to read more about spirng mvc then go and have a look
						in www.luv2code.com/spring-mvc-docs.
						
					Components of  a Spring MVC application:
						a set of web pages to layout UI components:
						a collection of spring beans(controller, services,etc..)
						spring configuration(XML, Annotations or java)
							
					how does Spring MVC works behind the scenes:
						 everything starts with the front controller 
						 and this the DispatcherServlet,it is part of the 
						 spring framework
						 and it is already developed by Spring Dev Team
						  and i will create Model objects(contains data), View templates(the jsp page)
						   and controller classes(business or processing logic).
						 the explaination is that when the front controller has the request, it 
						 sends the request to the controller. and the controller is the code that 
						 i will create or write, and the CONTROLLER have my business logic
						 and the business logic handles the request , store, retrieve data.for examlple
						 we can store data into the database or retrieve data from a webservice
						 and once we have the data we can place it in the model and place it into the appropriate view template,
						 MODEL. the model contains the data , stores the data into the database, or  
						 retrives the data from a web service and etc. before going to eclipse and 
						 writing some codes we will need to download the spring mvc code which is 
						 specific for this class. and also we will download the latest spring jar 
						 files  from the spring website. first thing we need to know is how to 
						 configure spring mvc. well baisically the hardest part is getting the 
						 configuration of the spring mvc right:
						 
				16.1_ add configuration to file WEB-INF/web.xml(part1)
				
					16.1.1_ Configuring the spring MVC Dispatcher servlet
					16.1.2_SetUp URL mapping to spring MVC Dispatcher Servlet
					
				16.2_add configuration to file: WEB-INF/spring-mvc-demo-servlet.xml
				
					16.2.1_Add support for spring component scanning
					16.2.2_ Add support for conversion, formating and validation
					16.2.2_ Configure Spring MVC view resolver
				
				now we move to ecplise and create a new project called
				spring-mvc-demo , we go to file, new, dynamic web project.
				after this step is done i will copy the lib folder from the 
				soft > spring framework release > libs
				and copy all the jars from there and paste them in our 
				spring-mvc-demo > WebContent > Web-INF > lib
				next we need to add the spring mvc jar files
				for that we  need to go to http://www.luv2code.com/downloads/udemy-spring-hibernate/solution-code-spring-mvc-config-files.zip
				then exctract it, then keep on opening the folders untill
				we reach lib, and then in that folder we will only copy two files(two javax files )
	 			and then we will paste these two in our lib folder of the spring-mvc-demo project
	 			next it is time to set up th xml files and for that we go to solution-code-spring-mvc-config-files
	 			and open the folder untill the config file then, we copy the two
	 			files which are .xml files and paste them in WEB-INF. after that we will have to create a new folder 
	 			called view to have the right path as same as the one which already exists in the .xml file ("/WEB-INF/view/" )
	
	
		16.3_ Creating Spring controller and view:
			16.3.1_ Create controller class(first we need to a new package(com.luv2code.springdemo.mvc))(then a class in that package called HomeController)
			16.3.2_ define controller method(ShowPage)
			16.3.3_ Add request mapping to controller method
			16.3.3_ return view name
			16.3.3_ develop the view page(in view page and name is(main-menu.jsp)).
				
				reading html form data(create a class called HelloWorldController class):
				now lets say when we are in the hello world-form page which is the
				first one, i want dont want to add showForm every time
				that i want to  create a link in the main-menu page so that i dont have
				to enter the showForm everytime, so i will just create an anchor link in main-menu.jsp
				 so when  we click on it it will go stright to the submit page(helloworld-form)
				 
				next we will work on adding data into the spring MODEL and how we can 
				read data from the model. we can add anything we want in the model,string,
				object, info from database.  in spring mvc when we create our controller methods
				we will have to use HttpServletRequest param to read data in the controller code (add these methods to hello world controller)
				after adding the methods mentioned above we will go to helloworld jsp file
				and  add the message for reading.next lets update view page so we can access
				the model data( have look at helloworld.jsp).now
					
				Adding as parent mapping for controller:
					serves as parent mapping for controller
					All requests mappings on methods in the controller are relative
					we will have make use of parent mapping when we face coflict in request
					paths. elaborate that i will create a new controller class(SillyController)  which has the
					same exact mapping as showForm. so to overcome this problem
					we will have to add a parent request mapping to our
					HelloWorldController and give it a name(hello). then the full path
					for showForm will be hello/showForm. and we will have to
					update the path for showForm in the main-menu.jsp.
			 		
			 		one thing which you might ask in the form is what is it with 
			 		path   = firstName and path = lastName and how does it map out?
			 		well this binds the form with a propety on the bean. 
			 		what spring will do behind the seens is that it will use these paths 
			 		to populate the form field, and after having that path spring 
			 		will call student.getFirstName and they will use the model attribute from up top to
			 		 the data and when the form is submited, spring will call the setter methods
			 		 so setter methods are called when the form is submitted. and in our controller
			 		 we will make use of the new annotation to bind the from data to object
			 		 and then passes it to the controller so that we can make use of it
			 		 
		16.4_Spring MVC Form tags_text-fields_simple spring mvc to send data through form, bind that data into an object
		   	 then send that data to controller so that we can make use of it. 
		   		Development process:
		   			 16.4.1_Create student class
		   			16.4.2_create student controller class
		 			16.4.3_create html form(student-form)
		 			 16.4.4_create form processing code
		 			16.4.5_create confirmation page
		16.5_ Spring mvc form tag_dropdown list. and example of the dropdown list is  we have a form, then the user
		can go and select their favorite country.
					16.5.1_update the html form(student-form)
					16.5.2_ update student class- add getter/setter for a new property
					16.5.3_update student confirmation page
			now lets say i want  read the list of the countries from a java class, so instead of 
			hard coding the values, we want to read the list from a java class, so for that
			the first thing we will do is define the country options in our student class.
			so to get all the options we will have to make use of linked hashmap which is a
			collection of name value pairs in an ordered fashion. so we will have country 
			options  so we will have a value and the actual label
			
			
		16.6_ Spring mvc form tag_radio buttons(only can choose one option)
			16.6.1_ update html form
			16.6.2_update student class
			16.6.3_ update confirmation page
			
		16.7_ Spring mvc form tag_checkboxes( can choose more than one option)	
			16.7.1_ update html form
			16.7.2_update student class(add getter/setters for new property)
			16.7.3_ update confirmation page
		
		17_Spring MVC form validation
			well the use of form validation is to check users input for required fields,
			valid numbers in a range, valid format(postal code), own custom business rules.
			spring version 4 and higher support Bean validation API. and to use it.
			we simply need to add validation jars to our projects
		Our road map for form validation(applying built-in validation rules):
			17.1_set up our development enviroment
				17.1.1_ download the validation jar files from hibernate website
						we go to www.hibernate.org and download the  click on the 
						hibernate validator and thenclick on the green button which is 
						written stable version and then in that link we will download the
						org.hibernate.validator:hibernate-validator:6.1.2.Final zip file,
						and then we unzip it in the desired folder, and then after that we
						need to add those downloded jars to our project, for that first we will need to 
						open the folder then we open dist and then copy the three jars in 
						our lib directory of our project.
							
								development process:
									1_add validation rule to our Customer class(create a new class called Customer)
									2_ display error message on html form(we will create new jsp file and name it customer-form.jsp)
										and make sure we have the spring form tag added in the jsp file above
									3_perform validation in our controller class(create a new class called customerController)
										after creating the controller class, we will have to link our for
										customer form in our main-menu.jsp. after that we will create our customer-confirmation.jsp page
										
									4_update confirmation page
						*one this to keep in mind that while working with validation, even 
						*tho in our customer controller class we are saying that our last name 
						* should be minimum of one character, but if that character is a white
						* space, it will act like a character  and it will not give us any error 
						* while adding only white space, and not adding any characters.
						* so to over come that problem the solution will be explained below:
								what we need to do is we need to trim the white space and make sure the white 
								space does not pass, to make that work, we will have to make use of an annotation called
								@InitBinder: this annotation works as a pre-processor. which means any web request
								that comes to our controller class(CustomerController class), the @InitBinder code will be executed first.
								 so we will use this annotation to:
								 	trim Strings
								 	remove leading and trailing white space
					
			17_Spring MVC form validation(validating number ranges) using @min and @max
				annotations. we add a new input field on our form for: free passes
				and in this free passes, a user will be able to enter a value 
				in range of 0 to 10, any number out of this range will give us 
		 		a validation error message displayed on the sceen.
		 		17.1_ add validation rule to customer class(same class we used for validating using built-in validation rules)
				17.2_ display error message on html form(we go to customer-form.sjp)
				17.3_ perform validation in the controller class	
				17.4_ update confirmation page	
			
			18_Spring MVC form validation(with regular expressions)
				a regular expression is sequence of characters that defines a search pattern
				this pattern is used to define or match strings, we can also use it for 
				validation.lets say we want to have the correct postcode and the user can only use 5 chars or digits 
				in order to pass validation because a postalcode is only 5 integers or characters
				18.1_ Add validation  rule to the customer class
				18.2_ Display error massage on html form	
				18.3_ Update confirmation page
				
			19_Spring MVC form validation(making integer field required )
				19.1_what i wanna do is to make the free passes field required. adn for that we will 
				have to change int to Integer because when it comes from the model
				the value is of type string, but what we want is to be of type of int
				so we will have to add the wapper class which is Intergr.
				
				19.2_and next we will learn how to handle string inputs for integer fields.
				we know that we can only add integer type to the Free passes field and 
				if we enter characters then we will face an issue and it will give us an error:
				development process for the above problem is as below:
					19.2.1_create custom error message
							src/resource/messages.properties
					19.2.1_load custom messages resource in spring spting config file
							WebContent/WEB-INF/spring-mvc-demo-servlet.xml 
							basically what we will do is we will create our own custom
							error message instead of gettingt the long ass error message
							when we enter characters instead of integers in freePasses 
							input.
							
							one thing to keep in mind and it is for debugging purposes
							if we want to find out where our errors are and  which is s
							the method that we hv used for our own cusom error message 
							that we have created, then we will have to go to customController
							class and add a println line for the method theBindingResult
							and after that we will  run our application and then we will 
							wee that in our console, the println that we used will
							print the files or messages that we have created, and that ut 
							one of the ways to debugg our codes.
					 
			20_Spring MVC validation(Custom validation).
				lets say e have some simple inputs which are, first name 
				last name and Course code, and for our course code, we want the 
				course code to start only with, LUV and if we enter any other characters 
				it will give us errors. first want we need to do is to perform
				custom validation base on our own business rules. spring mvc will
				call our custom validation.then custom validation returns boolean value for
				pass/fail(true/ false).
				
				first we will create our own custom java annotation
				development process:
						20.1_Create custom validation rule
							20.1.1_ create @CourseCode annotation(we create a new package)( for this we will have to make use of @interface)
							20.1.2_Create @CourseCodeConstrainValidator(this is where we will put our own custom logic)
							
						20.2_add validation rule to the customer class
						20.3_ display error messages on html(customer-form.jsp)
						20.4_Update confirmation page
			
	  21_Hibernate:
				21.1_ what is hibernate:?
					it is a famework  for persisting/saving java obejcts in a database
					  
				21.2_Benefits of hibernate:
					hibernate handles all of the low level-SQL code.
					what that means is that it actually minimizes the amount of the code that we need to
					write for jdbc.
					hibernate provides the object-to-rational Mapping(ORM) and that makes it
					really easy to store and retrieve objects from the database. 
				
				21.3_How does Hibernate relate to jdbc??
					hibernate uses jdbc for all database communications, so really  hibernate
					is another layer of extraction on top of jdbc.  so when  our application
					uses the hibernate framework, my app store and retrieve obejcts using
					the hibernate API in the background. hibernate does all fthe low-level
					jdbc work and submitting SQL queries and so on.  so hibernate does a lot
					of the low level work for us, but in the background, it all goes through
					the standard JDBC API. so when we get into the section of learning of the
					hibernate learning work and coding,where we actully configure hibernate
					to talk to our database, we will actully configure hibernate to make use
					of jdbc driver. so again hibernate uses jdbc in the bacground for
					communicating with the database.
							to build hibernate applications the things mentioed below are required:
								1_ Java Intergrated Development Enviroment
								2_ Database 
										just create a new table in the existing exampledb schema
								3_ creating hibernate project and then in that java project we will create a
								new folder called lib. in this folder we will add our hibernate and jdbc jar files.
								after that we go to www.hibernate.org. then we see the option name Hibernate ORM
								then we click on more and then click on latest stable,then find the download file for 
								it and then download it(hibernate-release-5.4.11.Final), then i save in soft folder and extract it there to make use of the
								jars in our folders to get hibernate up and running.
								when it is downloaded then we will open it up then we will open it, then open lib, then
								open required, and copy all the jars in that folder in our lib folder in our hibernate project.
								 and in the end we will copy my-sql connector and then we paste it in the
								 same folder, and one last step which is really impottant which is 
								 adding all those jar files in our  projects class  path. and for that what we can do is just go to
	 							eclipse and then  click on our project and then we will right click on our project
	 							and then we click on properties and then click on java build path, then add jars
	 							then we go and select all the jars that we added in the lib folder,
	 							and choose all of them and then we click on apply and close.
	 							
			 				when all the steps above are done, we will test our jdbc connection if it is workin or not
			 				and to test that out we will create a new package called com.luv2code.jdbc
			 				and then create a new class in that package named TestJdbc.
			 	
			 	22_Hibernate development process
			 		22.1_ add hibernate configuration file
			 				to add this file we  will have to go to  hibernate zip file, the same one that we downloaded
			 			////the sql files to add the sql codes to the(D:\WorkSpaces\udemy\springBoot and hibernate\new\spring-hibernate-source-code-v22\03-hibernate-5\hibernate-demo\starter-files)
			 			//	then we copy the xml file and paste it in the src of  our hibernate project
			 				
			 		//22.2_ annotate java class
			 		//	entity class is just java class that is mapped to a database table. it is class
			 		//	with fields, getter and setter methods, and then we add annotations on it to help with mapping it to a 
			 			//database. lets say we have a the class with fields, setters and getters and we want to map that class to a database
			 			//so somehow we need to tell hibernate how to map this class to the actual table and also how to map
			 			//fields to the actual colums and that is where we come to the whole mapping aspect of it. one thing to
			 			//keep in mind is that there are two ways of mapping,first option is with xml configuration file(XML), and the other one is with java annotations(modern, preferred)
			 			//so what we need to is first map our class to database table, then map fields to dayabase columns. to continue from here  go to hibernate tutorial.
			 			//first we create a new package called com.luv2code.hibernate.demo.entity.
						
						import javax.persistence.GeneratedValue;
						import javax.persistence.GenerationType;

							
			 			//then create e new class called Student and in that class we will add our mappings for the
			 			//table and the fields(means mapping our class to our database and then table,).
			 			after adding the the annotations of @Entity and @Table then we right click on that page,
			 			choose Source, then organize imports, then choose javax.persistence.Entity , then choose javax.persistence.Table 
			 			and these two are from java presistance API , which is a standard interface that hibernate implements
			 			then  we create a no argument constructor then we add  the fields and then we will 
			 			connect those fields with database using the annotations. then we will right click and
			 			then we will choose source, then organize imports and the imports for the id(when we click on orgnize imports,it will
			 			automatically add the imports that we need) . then after that we will right click choose source, then
			 			add generate constructor using fields we will not choose id because we wont use it later on becuse 
			 			it is auto-increment, after that we will create setters and getters.
			 			after that we click on source, then choose generate toString()
			 			and keep it as defult and then hit ok and then eclipse will automatically 
			 			will generate whatever is needed. the reason for generating to string is
			 			for ddebugging purposes so i can print out the obejct and get the actual
			 			details for it
			 			
			 	22.3_ develop java code to perform database operation
			 			22.3.1_firs t thing we need to know is how to save a java object when
			 			hibernating. and there are two key players that we need to be aware 
			 			and it is saved in the pictures folder of 21. first one is called
			 					SessionFactory class and we create it only once and then
			 					we keep on using it over and over again and it is a havy-weight object.and 
			 					once the session factory object is created, then that will create sessions
			 					and session is just a wrapper around a JDBC connection to the database.
			 					the session is the main object that we will use for saving and retrieving  objects
			 					from the database. unlike SessionFactory, session is short-lived object. we will
			 					use it and then throw it away again and again, so session is retrieved from the 
			 					SessionFactory.
			 			
			 			22.3.2_now we move to eclipse and start writing some code, and for that we need to
			 			right click on the src folder of our project, then we say new class and give the package 
			 			for that class as com.luv2code.hibernate.demo then  for class name we give it CreateStudentDemo.
			 			after that we will fix the imports and they are shown on top of the class.
			 				beside  all of these lets talk about primary key:primary key  
			 				uniquely identifies each row in a table and it must be a unique value
			  				and it cannot contain null. think of this way that in a university each 
			 				student has a unique student id, and so each student belongs to one student.
			 				so each primary key identifies each row in a table in database. in our model
			 				class of hibernate, we added the annotation of @Id, that means  the id is a 
			 				primary key. we will go to our Student and add the annotation for fild id(@GeneratedValue(strategy=GenerationType.IDENTITY) )
			 				after that we will create new class called primary key demo to
			 				check if this annotation is working or not.
			 				
			 				ok now one thing you might ask is how can i changge the auto
			 				incrementing valuses and customize it the way we want it to be done and incremented
			 				 if we want the table to start and increase from a certain numebr 
			 				 then we go to the database, on the top left we will  the
			 				 plus sign written sql on it. we click on it then 
			 				 write this in that new tab ALTER TABLE exmpledb.studnett AUTO_INCREMENT = 3000
			 				 Then the next id  when we enter a new value  will start from 3000.
			 				 
			 				 next if i want to reset the increment value to start from one and that can be done 
			 				 by runnig this query in the same place we run the old one: truncate exampledb.studentt
			 				 this will delete everything and it will delete all the rows of the table
			 					
			 			
			 		22.3.3_after learning the concepts above and knowing how to create an object 
			 			   in hibernate then  next we will learn about howe we can read objects in hibernate.
			 			   and to do that we will just copy the CreateStudentDemo and just change and modify it a little bit
			 			   one thing to keep in mind is that in hibernate world, we will always make use of transactions for updates and for reads
			 		
			 		22.3.4_ next we will learn about querying objects with hibernate
			 				it is a query language for retrieving objects and its
			 				nature is simillar to  SQL for example like,where, like,join
			 				for example we can create a query to retrieve all the students
			 				again for querying an object in hibernate,we will copy the 
			 				the class CreateStudentDemo.java and make changes to that class
			 				and create a new class called QueryStudents.
			 				
			 	 	22.3.4_next up  is we will learn how to update objects using hibernate:
			 	 		   one thing to keep in mind about the update part is that we simply
			 	 		   retrieve  the object,we set the value, and the we commit the transaction
			 	 		   there is no hard requirement for us to call session.save or session.update
	 						because this student object is a  continuous object that we retrieved it from
	 						database. we can simply call the appropriate setters and then fnally do a commit
	 						and that actually update the database. so after updating one student ,
	 						next we will update the first name of the all students to one 
	 						particular name.
	 						
	 				22.3.4_next up is deleting obejcts from database using hibernate
			 				there two approaches we can use to delete an object from a database,
			 				first one is we get student based on the id, and then we  use session.delete which is a 
			 				hibernate query and the second approch is using sql query delete from.
			 		
			 		22.4_next topic to learn is about hibernate advanced mapping, when we talk about 
			 			 advanced mappings, it is most likely we will have multiple tables and then there is some
			 			 relationship between the tables, and the connection between the tables we will have to model
			 			 this using hibernate.there are three different types of advanced mappings which are one-to-one, one-
			 			 to-many, many-to-one, many-to-many. an instrcutor can have instructor_detail entity
			 			 ONE-TO-ONE MAPPING: lets say we have table called instructor and then another table is called
			 			 instructor_details,the instructor table is connected to instructor_detail table using one-to-one
			 			  advanced mapping.
			 			  ONE-TO-MANY: an instructor can have many courses. 
			 			  MANY-TO-ONE: a course can have many instructors.
			 			  MANY-TO-MANY:  a course can have many students and a student can have many courses.
			 			  
			 			  to be able to have a good understading abiyt these concepts and be able to do advanced mapping
			 			  we will have to know some  concepts of database which are primary and foreign keys and cascading.
			 			  PRIMARY KEY identifies a unique row in table and FOREIGN KEY links the tables together. well a 
			 			  foreign key is a field in a table that refers to a primary key to another table. so lets say i have 
			 			  two tables, one is called  instructor,and the other one is called, instructor_ details, so  in the 
			 			   instructor table we have  id, first name, last name, instuctor_detail_id and this is a specific number
			 			   which is same as  the id of the table instuctora_detail. we can have another id in the instructor table
			 			   which has a different name from the first one, and these will have different instructor_detail_id
			 			   and that will refer to the details of that id in the intructor_detail table.
			 			   
			 			   one more thing we will have to learn is about cascading, we can cascade operations and that means we can
			 			   apply same operation to the same entities. so lets say we have an instructor and instrcutor details, 
			 			   if we save instructor, then instrcutor detail will be saved as well. more on to that if we delete an
			 			   instuctor, then we should instructor details as well, this is also known as cascading delete.BUT
			 			   in many-to-many mapping, if we delete a student, then we can delete a course,  because this 
			 			   course is also taken by other students and we cant delete it, so here is here is where we can configure
			 			   cascadind and for that we will come to it later on in this course.
			 			   uni-directional means it only goes one way, but bi-directional means it goes both ways
			 			   
			 		development process: ONE-to-one
			 			22.4.1_ prep work- definding database tables(instructor_detail and instructor tables)
			 			22.4.2_ ceate InstructorDetail class (in com.luv2code.hibernate.demo package)
			 			22.4.3_ create instrcutor class(in com.luv2code.hibernate.demo.entity package )
			 			22.4.3_ create MainApp(we will rename the class that we kept at the start(CreateStudentDemo))
			 					and then rewrite the code and change the code insdide that class and work on it and 
			 					change it the way that we want.
			 			
			 			
			 		*one cool thing we  will be able to do is we can reverse engineer the table and get a diagram 
			 		*for a needed table and that will be really good for documentations,
			 		*we can do that by click on database, then choose reverse engineer, then choose the
			 		*stored connection, then we will click on continue, then again choose continue, then we 
			 		*choose the related schema that we want to get the diagrams for it, then click on continue,
			 		*then we should make sure to tick the option which is place imported objects  on a diagram
			 		*
			 	
			 	now to get started we will copy the exsisting availbe porject of hibernate 
			 	tutorial,and we paste it in the same place, and the first thing we will do 
			 	is test the jdbc, after making sure that the jdbc is working fine, then we
			 	will delete all the classes in com.luv2code.hibernate.demo package and only
			 	keep createStudentDemo class. after finshing this step we will create InstructorDetail class
			 	
					up until here whatever we learned was about uni-directirectional, and now we will
					discuss about bi-directional, and bi-directional means it goes both ways. for uni-directional
					we only load the instructor then we get the associated instructorDetail, but now what we want to do is 
					when we load the InstructorDetail, we would like to get associated instructor and we can do it with the 
					current uni-directional that we have right now.
					
			 		development process one-to-one(bi-directional)
			 			22.4.4_make updates to InstructorDetail class
			 				   we need to add a new field(Instructor) to reference the instructor.
			 				   add getter and setter methods for the instructor.
			 					add @One-to-one annotation such that we can  points back to original instructor
			 			22.4.5_ create main app(GetInstructorDetailDemo)
			 			
			 	
						 	one thing we will have to keep in mind is that if we change theId in the class(GetInstructorDetailDemo)
						 	and make it 2999, this id does not exist in our database and this will give error, and it will print null for
						 	tempInstructorDetail.moreoover it will give error as collection leak detectd, one unclosed connections upon
						 	shutting down pool and the route cause is because we didnt close the hibernate session and when null
						 	pointer happens we didnt have a chance to greatfully recover.and to fixt that we will have to add a catch block
						 	and then in finally block we will close the session.
						 	
						 		
						22.4.6_ Delete instructorDetail Cascade Delete(bi-directional) and that means deleting the associated instructor.
								first we will copy one of the main apps we have from before(GetInstructorDetailDemo) and then paste it
								 (change its name to DeleteInstructorDetailDemo)and then make the required changes to it to make it work
								  the way that we want.
			 	
			 	 		
			 	 		22.4.7_ lets look at another senario which we only want to delete
			 	 				the instructor detail and keep the instructor itself. so we can do this
			 	 				by modifying the cascade type on the instructor detail entity(InstructorDetail class the one near the
			 	 				mappedBy). in that class we will add everrything(all the cascade types) except remove.
			 	 				
			 	 		 22.4.8_now after doing this we will need to go to the  main class(DeleteInstructorDetailDemo)
			 	 				and then we need to remove the association or break the bi-directional link because if you
			 	 				remember we have links betweenntempInstructor and the Instructor and then the instructor
			 	 				is pointing back to the instructor detail and that is bidirectional mapping.
			 	 		
	 				22.5_ One-to-Many Bi-directional advanced mapping:
	 					this one is about an instructor having many courses and there is association which means it goes both
	 					ways(<--->). which means we can either start with an instructor and go to the course or start with the 
	 					course and go to the instructor. real world project requirements are if you delete an instructor, 
	 					do not delete the courses and if you delete   course then do not delete the instructor and  what this means
	 					is that do not apply cascading deletes.
	 							Development process:
	 							22.5.1_ pre work -define database tables(course table) and for the course table for the title we will have
	 							 		to use unique key and that is because we do not want to have a duplicate course title. and for the
	 							 		instructor table, we will not change anything and keep it as it is and use it.
	 							 		
	 							 		if we have a ready written sql file then what we need to do is go to our mysqlworkbench
	 							 		and then click on file and then choose open sql script and then choose the file that we want.
	 							 		which in this case we already have one so we just choose that one and then change the files
	 							 		in the project, for example we will have to change the name of the schema
	 							 		
	 							22.5.2_ create course class
	 									in this class we will have many to one annotation 
	 							22.5.3_ update instructor class
	 							22.5.4_	create main app
	 								
	 						
	 					
	 					
	 		package theory;

public class Theory {
	
	/*
	 
	  21_Hibernate:
				21.1_ what is hibernate:?
					it is a famework  for persisting/saving java obejcts in a database
					  
				21.2_Benefits of hibernate:
					hibernate handles all of the low level-SQL code.
					what that means is that it actually minimizes the amount of the code that we need to
					write for jdbc.
					hibernate provides the object-to-rational Mapping(ORM) and that makes it
					really easy to store and retrieve objects from the database. 
				
				21.3_How does Hibernate relate to jdbc??
					hibernate uses jdbc for all database communications, so really  hibernate
					is another layer of extraction on top of jdbc.  so when  our application
					uses the hibernate framework, my app store and retrieve obejcts using
					the hibernate API in the background. hibernate does all fthe low-level
					jdbc work and submitting SQL queries and so on.  so hibernate does a lot
					of the low level work for us, but in the background, it all goes through
					the standard JDBC API. so when we get into the section of learning of the
					hibernate learning work and coding,where we actully configure hibernate
					to talk to our database, we will actully configure hibernate to make use
					of jdbc driver. so again hibernate uses jdbc in the bacground for
					communicating with the database.
							to build hibernate applications the things mentioed below are required:
								1_ Java Intergrated Development Enviroment
								2_ Database 
										just create a new table in the existing exampledb schema
								3_ creating hibernate project and then in that java project we will create a
								new folder called lib. in this folder we will add our hibernate and jdbc jar files.
								after that we go to www.hibernate.org. then we see the option name Hibernate ORM
								then we click on more and then click on latest stable,then find the download file for 
								it and then download it(hibernate-release-5.4.11.Final), then i save in soft folder and extract it there to make use of the
								jars in our folders to get hibernate up and running.
								when it is downloaded then we will open it up then we will open it, then open lib, then
								open required, and copy all the jars in that folder in our lib folder in our hibernate project.
								 and in the end we will copy my-sql connector and then we paste it in the
								 same folder, and one last step which is really impottant which is 
								 adding all those jar files in our  projects class  path. and for that what we can do is just go to
	 							eclipse and then  click on our project and then we will right click on our project
	 							and then we click on properties and then click on java build path, then add jars
	 							then we go and select all the jars that we added in the lib folder,
	 							and choose all of them and then we click on apply and close.
	 							
			 				when all the steps above are done, we will test our jdbc connection if it is workin or not
			 				and to test that out we will create a new package called com.luv2code.jdbc
			 				and then create a new class in that package named TestJdbc.
			 	
			 	22_Hibernate development process
			 		22.1_ add hibernate configuration file
			 				to add this file we  will have to go to  hibernate zip file, the same one that we downloaded
			 			////the sql files to add the sql codes to the(D:\WorkSpaces\udemy\//springBoot and hibernate\new\spring-hibernate-source-code-v22\03-hibernate-5\hibernate-demo\starter-files)
			 			//	then we copy the xml file and paste it in the src of  our hibernate project
			 				
			 		//22.2_ annotate java class
			 		//	entity class is just java class that is mapped to a database table. it is class
			 		//	with fields, getter and setter methods, and then we add annotations on it to help with mapping it to a 
			 			//database. lets say we have a the class with fields, setters and getters and we want to map that class to a database
			 			//so somehow we need to tell hibernate how to map this class to the actual table and also how to map
			 			//fields to the actual colums and that is where we come to the whole mapping aspect of it. one thing to
			 			//keep in mind is that there are two ways of mapping,first option is with xml configuration file(XML), and the other one is with java annotations(modern, preferred)
			 			//so what we need to is first map our class to database table, then map fields to dayabase columns. to continue from here  go to hibernate tutorial.
			 			//first we create a new package called com.luv2code.hibernate.demo.entity.
						
						import javax.persistence.GeneratedValue;
						import javax.persistence.GenerationType;

							
			 			//then create e new class called Student and in that class we will add our mappings for the
			 			//table and the fields(means mapping our class to our database and then table,).
			 			after adding the the annotations of @Entity and @Table then we right click on that page,
			 			choose Source, then organize imports, then choose javax.persistence.Entity , then choose javax.persistence.Table 
			 			and these two are from java presistance API , which is a standard interface that hibernate implements
			 			then  we create a no argument constructor then we add  the fields and then we will 
			 			connect those fields with database using the annotations. then we will right click and
			 			then we will choose source, then organize imports and the imports for the id(when we click on orgnize imports,it will
			 			automatically add the imports that we need) . then after that we will right click choose source, then
			 			add generate constructor using fields we will not choose id because we wont use it later on becuse 
			 			it is auto-increment, after that we will create setters and getters.
			 			after that we click on source, then choose generate toString()
			 			and keep it as defult and then hit ok and then eclipse will automatically 
			 			will generate whatever is needed. the reason for generating to string is
			 			for ddebugging purposes so i can print out the obejct and get the actual
			 			details for it
			 			
			 	22.3_ develop java code to perform database operation
			 			22.3.1_firs t thing we need to know is how to save a java object when
			 			hibernating. and there are two key players that we need to be aware 
			 			and it is saved in the pictures folder of 21. first one is called
			 					SessionFactory class and we create it only once and then
			 					we keep on using it over and over again and it is a havy-weight object.and 
			 					once the session factory object is created, then that will create sessions
			 					and session is just a wrapper around a JDBC connection to the database.
			 					the session is the main object that we will use for saving and retrieving  objects
			 					from the database. unlike SessionFactory, session is short-lived object. we will
			 					use it and then throw it away again and again, so session is retrieved from the 
			 					SessionFactory.
			 			
			 			22.3.2_now we move to eclipse and start writing some code, and for that we need to
			 			right click on the src folder of our project, then we say new class and give the package 
			 			for that class as com.luv2code.hibernate.demo then  for class name we give it CreateStudentDemo.
			 			after that we will fix the imports and they are shown on top of the class.
			 				beside  all of these lets talk about primary key:primary key  
			 				uniquely identifies each row in a table and it must be a unique value
			  				and it cannot contain null. think of this way that in a university each 
			 				student has a unique student id, and so each student belongs to one student.
			 				so each primary key identifies each row in a table in database. in our model
			 				class of hibernate, we added the annotation of @Id, that means  the id is a 
			 				primary key. we will go to our Student and add the annotation for fild id(@GeneratedValue(strategy=GenerationType.IDENTITY) )
			 				after that we will create new class called primary key demo to
			 				check if this annotation is working or not.
			 				
			 				ok now one thing you might ask is how can i changge the auto
			 				incrementing valuses and customize it the way we want it to be done and incremented
			 				 if we want the table to start and increase from a certain numebr 
			 				 then we go to the database, on the top left we will  the
			 				 plus sign written sql on it. we click on it then 
			 				 write this in that new tab ALTER TABLE exmpledb.studnett AUTO_INCREMENT = 3000
			 				 Then the next id  when we enter a new value  will start from 3000.
			 				 
			 				 next if i want to reset the increment value to start from one and that can be done 
			 				 by runnig this query in the same place we run the old one: truncate exampledb.studentt
			 				 this will delete everything and it will delete all the rows of the table
			 					
			 			
			 		22.3.3_after learning the concepts above and knowing how to create an object 
			 			   in hibernate then  next we will learn about howe we can read objects in hibernate.
			 			   and to do that we will just copy the CreateStudentDemo and just change and modify it a little bit
			 			   one thing to keep in mind is that in hibernate world, we will always make use of transactions for updates and for reads
			 		
			 		22.3.4_ next we will learn about querying objects with hibernate
			 				it is a query language for retrieving objects and its
			 				nature is simillar to  SQL for example like,where, like,join
			 				for example we can create a query to retrieve all the students
			 				again for querying an object in hibernate,we will copy the 
			 				the class CreateStudentDemo.java and make changes to that class
			 				and create a new class called QueryStudents.
			 				
			 	 	22.3.4_next up  is we will learn how to update objects using hibernate:
			 	 		   one thing to keep in mind about the update part is that we simply
			 	 		   retrieve  the object,we set the value, and the we commit the transaction
			 	 		   there is no hard requirement for us to call session.save or session.update
	 						because this student object is a  continuous object that we retrieved it from
	 						database. we can simply call the appropriate setters and then fnally do a commit
	 						and that actually update the database. so after updating one student ,
	 						next we will update the first name of the all students to one 
	 						particular name.
	 						
	 				22.3.4_next up is deleting obejcts from database using hibernate
			 				there two approaches we can use to delete an object from a database,
			 				first one is we get student based on the id, and then we  use session.delete which is a 
			 				hibernate query and the second approch is using sql query delete from.
			 		
			 		22.4_next topic to learn is about hibernate advanced mapping, when we talk about 
			 			 advanced mappings, it is most likely we will have multiple tables and then there is some
			 			 relationship between the tables, and the connection between the tables we will have to model
			 			 this using hibernate.there are three different types of advanced mappings which are one-to-one, one-
			 			 to-many, many-to-one, many-to-many. an instrcutor can have instructor_detail entity
			 			 ONE-TO-ONE MAPPING: lets say we have table called instructor and then another table is called
			 			 instructor_details,the instructor table is connected to instructor_detail table using one-to-one
			 			  advanced mapping.
			 			  ONE-TO-MANY: an instructor can have many courses. 
			 			  MANY-TO-ONE: a course can have many instructors.
			 			  MANY-TO-MANY:  a course can have many students and a student can have many courses.
			 			  
			 			  to be able to have a good understading abiyt these concepts and be able to do advanced mapping
			 			  we will have to know some  concepts of database which are primary and foreign keys and cascading.
			 			  PRIMARY KEY identifies a unique row in table and FOREIGN KEY links the tables together. well a 
			 			  foreign key is a field in a table that refers to a primary key to another table. so lets say i have 
			 			  two tables, one is called  instructor,and the other one is called, instructor_ details, so  in the 
			 			   instructor table we have  id, first name, last name, instuctor_detail_id and this is a specific number
			 			   which is same as  the id of the table instuctora_detail. we can have another id in the instructor table
			 			   which has a different name from the first one, and these will have different instructor_detail_id
			 			   and that will refer to the details of that id in the intructor_detail table.
			 			   
			 			   one more thing we will have to learn is about cascading, we can cascade operations and that means we can
			 			   apply same operation to the same entities. so lets say we have an instructor and instrcutor details, 
			 			   if we save instructor, then instrcutor detail will be saved as well. more on to that if we delete an
			 			   instuctor, then we should instructor details as well, this is also known as cascading delete.BUT
			 			   in many-to-many mapping, if we delete a student, then we can delete a course,  because this 
			 			   course is also taken by other students and we cant delete it, so here is here is where we can configure
			 			   cascadind and for that we will come to it later on in this course.
			 			   uni-directional means it only goes one way, but bi-directional means it goes both ways
			 			   
			 		development process: ONE-to-one
			 			22.4.1_ prep work- definding database tables(instructor_detail and instructor tables)
			 			22.4.2_ ceate InstructorDetail class (in com.luv2code.hibernate.demo package)
			 			22.4.3_ create instrcutor class(in com.luv2code.hibernate.demo.entity package )
			 			22.4.3_ create MainApp(we will rename the class that we kept at the start(CreateStudentDemo))
			 					and then rewrite the code and change the code insdide that class and work on it and 
			 					change it the way that we want.
			 			
			 			
			 		*one cool thing we  will be able to do is we can reverse engineer the table and get a diagram 
			 		*for a needed table and that will be really good for documentations,
			 		*we can do that by click on database, then choose reverse engineer, then choose the
			 		*stored connection, then we will click on continue, then again choose continue, then we 
			 		*choose the related schema that we want to get the diagrams for it, then click on continue,
			 		*then we should make sure to tick the option which is place imported objects  on a diagram
			 		*
			 	
			 	now to get started we will copy the exsisting availbe porject of hibernate 
			 	tutorial,and we paste it in the same place, and the first thing we will do 
			 	is test the jdbc, after making sure that the jdbc is working fine, then we
			 	will delete all the classes in com.luv2code.hibernate.demo package and only
			 	keep createStudentDemo class. after finshing this step we will create InstructorDetail class
			 	
					up until here whatever we learned was about uni-directirectional, and now we will
					discuss about bi-directional, and bi-directional means it goes both ways. for uni-directional
					we only load the instructor then we get the associated instructorDetail, but now what we want to do is 
					when we load the InstructorDetail, we would like to get associated instructor and we can do it with the 
					current uni-directional that we have right now.
					
			 		development process one-to-one(bi-directional)
			 			22.4.4_make updates to InstructorDetail class
			 				   we need to add a new field(Instructor) to reference the instructor.
			 				   add getter and setter methods for the instructor.
			 					add @One-to-one annotation such that we can  points back to original instructor
			 			22.4.5_ create main app(GetInstructorDetailDemo)
			 			
			 	
						 	one thing we will have to keep in mind is that if we change theId in the class(GetInstructorDetailDemo)
						 	and make it 2999, this id does not exist in our database and this will give error, and it will print null for
						 	tempInstructorDetail.moreoover it will give error as collection leak detectd, one unclosed connections upon
						 	shutting down pool and the route cause is because we didnt close the hibernate session and when null
						 	pointer happens we didnt have a chance to greatfully recover.and to fixt that we will have to add a catch block
						 	and then in finally block we will close the session.
						 	
						 		
						22.4.6_ Delete instructorDetail Cascade Delete(bi-directional) and that means deleting the associated instructor.
								first we will copy one of the main apps we have from before(GetInstructorDetailDemo) and then paste it
								 (change its name to DeleteInstructorDetailDemo)and then make the required changes to it to make it work
								  the way that we want.
			 	
			 	 		
			 	 		22.4.7_ lets look at another senario which we only want to delete
			 	 				the instructor detail and keep the instructor itself. so we can do this
			 	 				by modifying the cascade type on the instructor detail entity(InstructorDetail class the one near the
			 	 				mappedBy). in that class we will add everrything(all the cascade types) except remove.
			 	 				
			 	 		 22.4.8_now after doing this we will need to go to the  main class(DeleteInstructorDetailDemo)
			 	 				and then we need to remove the association or break the bi-directional link because if you
			 	 				remember we have links betweenntempInstructor and the Instructor and then the instructor
			 	 				is pointing back to the instructor detail and that is bidirectional mapping.
			 	 		
	 				22.5_ One-to-Many Bi-directional advanced mapping:
	 					this one is about an instructor having many courses and there is association which means it goes both
	 					ways(<--->). which means we can either start with an instructor and go to the course or start with the 
	 					course and go to the instructor. real world project requirements are if you delete an instructor, 
	 					do not delete the courses and if you delete   course then do not delete the instructor and  what this means
	 					is that do not apply cascading deletes.
	 							Development process:
	 							22.5.1_ pre work -define database tables(course table) and for the course table for the title we will have
	 							 		to use unique key and that is because we do not want to have a duplicate course title. and for the
	 							 		instructor table, we will not change anything and keep it as it is and use it.
	 							 		
	 							 		if we have a ready written sql file then what we need to do is go to our mysqlworkbench
	 							 		and then click on file and then choose open sql script and then choose the file that we want.
	 							 		which in this case we already have one so we just choose that one and then change the files
	 							 		in the project, for example we will have to change the name of the schema ib our xml file.
	 							 		
	 							22.5.2_ create course class in(com.luv2code.hibernate.demo.entity) package
	 									
	 									in this class we will have many to one annotation 
	 							22.5.3_ update instructor class(we will just add the needed stuff for course in the existing Instructor class)
	 									and we will have to add convenice methods for bi-directional relationship in 
	 									the instructor class too.because it will help us to setup the bi-directional 
	 									betwween instructors and courses because we want o go eaither ways
	 									
	 							22.5.4_	create main app(CreateInstructorDemo in com.luv2code.hibernate.demo package )
	 									then add annotated Course class to it
	 									and lastly we will have to change the schema name in our xml file because now we have
	 									now for this project we are using a new schema and it has its separate tables.
	 							22.5.5_ next up we will create some courses for an instructor and save them in the database(we will copy
	 									CreateInstructorDemo and make use of it ) and name it createCourseDemo
	 			
	 							22.5.6_ next we  will actually create an app and then we will an app to get the instructor
	 									the courses. we will copy the CreateCourseDemo class(in com.luv2code.hibernate.demo package) and then paste it and change its name 
	 									to GetInstructorCoursesDemo
	 							
	 							22.5.7_next up what we want to do is we want to delete the course but we do not
	 									want to delete the instructor so what that means is that we do not have to
	 									apply delete cascading so we will copy the getInstructorCourseDemo and then 
	 									we paste it and rename it to DeleteCourseDemo and make the necessary 
	 									changes to it 
	 						
	 					
	 							23_spring mvc and hibernate curd operations:
	 								this lesson is about buiding a full working sprinng and hibernate crud application 
	 								that is connected to the database. so the app we want to build is a customer-relationship management
	 								which will be able to add, delete,update and read the customers using spring mvc and hibernate.
	 								
	 								23.1_first we will setup our database development enviroment
	 									which is basically the database tables and schemas that we need to set up
	 									and for that we already the schemas and the tables which we will  copy them from the folders they are in.
	 									D:\WorkSpaces\udemy\springBoot and hibernate\spring and hibernate\spring-hibernate-source-code-v22\04-spring-mvc-crud-5\sql-scripts
	 									first we copy the customer tracker and that one is a schema.
	 									
	 								23.2_ then we will create a dynamic web project and add the jdbc driver to the project first
	 									which is in this folder D:\jars  and paste it in web-inf lib directory
	 									then we will create a new package called testdb to test our database connectivity
	 									and then we create a new servlet and click next and next and then will uncheck
	 									doPost and constructor from superclass. after testing the connection of the database is all good then we will
	 								
	 								23.3_setting up development enviroment:
	 									23.3.1_ copy starter config files(web.xml and spring config)
	 											D:\WorkSpaces\udemy\springBoot and hibernate\spring and hibernate\spring-hibernate-source-code-v22\04-spring-mvc-crud-5\
	 											web-customer-tracker-starter-files\WebContent\WEB-INF.(xml and servlet.xml files). we copy these two and paste
	 											its better to stop the tomcat server first because there is a lot of configurations that are being added to
	 											the project, so its better to stop it nad then all those configs files.
	 									
	 									23.3.2_copy over jstl libs
	 											D:\WorkSpaces\udemy\springBoot and hibernate\spring and hibernate\spring-hibernate-source-code-v22\04-spring-mvc-crud-5\
	 											web-customer-tracker-starter-files\WebContent\WEB-INF\lib(copy the two files with javax) and paste them 
	 											in lib of the  WEB-INF
	 									23.3.3_ copy latest spring jar files:
	 											we go to D:\soft\spring-framework-5.2.3.RELEASE\libs
	 											and copy all the jar files in this folder and paste them in lib folder of 
	 											our project
	 									23.3.4_copy latest hibernate jar files
	 											to copy all the jar files for hibernate we will go to the folders below an copy all the
	 											jars files in the line below to the lib folder of our project
	 											D:\soft\hibernate-release-5.4.11.Final\lib\required 
	 									
	 									23.3.5_ Configuration for sring and  hibernate
	 											23.3.5.1_ defining database datasource connecion pool
	 													hibernate uses a connection pool to connect to database
	 													in the xml file uptop we will setup a bean id(mydataSource)
	 													and we give the class of combopooleddataSource
	 													and that one is from c3p0 package, the ones we added the jars in our project lib folder.
	 													next in that file we setup the connection information such aas driver class name, the jdbcUrl, the user
	 													name and the password. and at the buttom we will configure the max and min pool size
	 													
	 													
	 											23.3.5.2_ setUp session factory
	 													session factory is what hibernate uses to connect to the database. we add the mySourseData
	 													and then we specify the packages to be scanned. so we say it scan the packges to find the entity classes.
	 													after that we will specify the dialect, to use mysql dialect. so basically we will tell it to show sql 
	 													and any additional hibernate properties we can place there
	 													
	 								 			23.3.5.3_ setup hibernate transaction manager
	 								 					 if you remeber when we write a hibernate code, we wil start a transaction,
	 								 					 in the transaction and so on, well spring has a support where we can minimize
	 								 					 or eliminate that code in our DAO classes(dao is a simple java class which contains JDBC logic . Data Access Layer has proven good in separate business logic layer and persistent layer. The DAO design pattern completely hides the data access implementation from its clients).
	 								 					 so we just set it up in the xml file and then we gave it a refrence of the sessionFactory and it will use it from the supported built-in spring files.
	 								 					 
	 											23.3.5.4_ enable configuration of transactional annotations.
	 													  spring provides a special annotation called @Transactional
	 													  which will allows us to minimize or eliminate some of our codings
	 													  for manually startring and stopinng transactions
	 													  
				 														all the configurations above will go to the spring config file
				 														which is (spring-mvc-curd-demo-servlet.xml)
				 										
	 									
	 								
	 											24_Testing Spring MVC controller
	 												we will have a customer controller class which will respond to a request
	 												mapping for /customer/list(pic is taken and saved in the picture folder of
	 												this video series).
	 												so we setup a package and create controller class.then we create the view
	 												folder in WEB-INF to add our needed jsp files.
____________________________________________________________________________________________________________________________________________________________________________________________	 												
	 									 25_Maven:
		 										create moven projects with eclipse.
		 										add dependancies to maven pom.xml.
		 										build and run moven projects.
		 										develop maven projects for java and spring apps.
		 										import maven projects.
		 										 run moven from the command line.
		 										 
	 										what is maven?
	 												maven is a project management tool for our applications and most popular use of maven is for build managment and dependencies
	 										 
	 										what problems doea maven solve?
		 											when we build our java projects we will need additional jar files like spring, hibernate jar files.one 
		 											approche is to download those jar files which we need,and then we will have to manually add those jar files
		 											to the project buildpath/class path. so a project without maven, for example if i want to create a spring
		 											project then i have to go to their website and download their jar files and add them to my project manually.
		 											so what maven does is that it will downlaod all the jar files and make them availbel during run time. so 
		 											we can think of maven as a friendly helper, we give him a list and then it goes out and does
		 											the shopping for us
		 										
	 										how does moven work behind the seens?
		 											 using maven we have a project configuration file that maven will read, basiclly it is 
		 											 our shopping list. then maven will check the maven local repositoy that resides on our
		 											 computer, if we dont have  the files in the local repositoy, then maven will actually go to
		 											 internet and download the needed jar files from the maven central repo on internet then it will
		 											 save those files in our local repository and then maven will use that to run our applications
		 										
	 										 handling jar dependencies:
		 										 	when maven retrieves a project dependency it will also download the supporting dependencies
		 										 	for example spring depends on commons lagging so when we say to maven that we need dependencies
		 										 	for spring it will automactically know that it needs to download jar files for common-loggings
		 										 	
	 										 building and running;
	 										 		when we build and run our app, maven will handle class/build path for us
	 										 
	 										 standard directory structure:
		 										 	normally when join a project, each developer will have their own directory structor
		 										 	and it is not a good idea for new joiners of the project and it is not standarized.
		 										 	so maven solves this problem by providing a standard directory structure.
		 										 	so if some other people are working on a project, by use of maven  we will quickly now wheree
		 										 	the jars and dependencies are located. one more thing to keep in mind is that moven porjects 
		 										 	are portable, so developers can share projects between IDEs.
		 									advantages of maven:
		 									 		dependency management
		 									 			maven will find jars for us
		 									 			so no more missing jars
		 									 		it will build and run our project
		 									 		 	no more worrying about the buildpath or classpath 
		 									 		standart directory structor
		 									 		 so over all we can build a project with minimal local configuration
		 									 Maven key Concepts:
			 									 	POM file
			 									 		this file is the project model file  and it is the configuration file for our project, or basically
			 									 		this is our shopping list for maven. in this file we will have a list of dependencies, project meta data
			 									 		and a list of plugins. project meta data is basically information about our project, for example project name
			 									 		version
			 									 		
			 									 	project coordinates
			 									 		projct coordinates uniquely identify a project it is something simillar to gps coordinates for our house
			 									 		for example if i want to find ur house, i would aska bout ur city, ur street and ur housr number
			 									 		in the picture saved by the spinning tool, and the image is called project coordinate elements,
			 									 		snapshot means the project is still under development
			 									 	
			 									 	adding dependencies:
			 									 		to see an example of adding dependencies, go to the file of pictures in maven and take a look at the 
			 									 		adding dependencies picture.
			 									 	
			 									 	dependency coordinates:
			 									 		for this also go the folder of picture.
			 									 	
			 									 	 how to find the dependency coordinates:
			 									 	 		also have a look at the pictures folder(the better one is using maven.org)
			 									 	 		so if we want to find dependencies for hibernate or spring or any other thing
			 									 	 		that we might need we will go to https://search.maven.org/ , then we search for
			 									 	 		example we want for hibernate core so we write hibenate core, then we click it
			 									 	 		then we will see written apache maven, we will copy whatever is in that box and paste it 
			 									 	 		in our pom.xml file 
			 									 	 		
			 									 	 		dependency>
	  															<groupId>org.hibernate</groupId>
	  															<artifactId>hibernate-core</artifactId>
	  															<version>6.0.0.Alpha4</version>
	  															<type>pom</type>
															</dependency>
			 									 		
		 									 	Maven Archetypes(or starter project files):
		 									 		archetypes can be used to create new maven projects and it contains
		 									 		tamplate files for given maven project. we can think of it a collection
		 									 		of starter files for a  java or web project. in our ide which is eclipse,
		 									 		when we choose to create maven projects, we will also be given the option
		 									 		of choosing archetype 
		 									 	
			 									 	to create a maven project, we will have to check if we have 
			 									 	m2eclipse plugin installed in eclipse for maven support.
			 									 	for that to have it installed we go to help > install new software > what is already installed? 
			 									 	then we check if we have the two important plugins which are m2e maven integration for eclipse
			 									 	and m2e wtp	 so if we have them then we click on new > others > maven project > next > quickstart archetype > id and artifact and version 1.0
		 											after making the changes, we will have to update the project that we created and the steps to do that is below;
		 											right click on the project > maven > update project > ok
		 										
		 										creating maven web project:
		 											create a webapp maven project with eclipse.
		 												right click in projcet exproler, then new > maven project > then we choose webapp and then hit finish
		 												after creating the project, we will get an error in it because we did not add the javax.servlet.api dependencies
		 												in our pom.xml file and to get rid of this error we will have to add the dependencies for them. so we go to
		 												https://search.maven.org/ and search for javax.servlet-api and then again select the same thing and then 
		 												after that we will choose the 3.1.0 because not all the servers are upto date
		 											explore the generated files and directories
		 											add dependencies to our pom file.
		 											run our web app.
		 											
________________________________________________________________________________________________________________________________________________________		 															 
		 					
		 						26_Spring REST overvieew(REST APIs / web services with REST controllers) 
		 								what we will learn:
			 									we will create REST APIs/web services with spring.
			 									discuss rest concepts: jason and http messaging.
			 									install rest client tool: postman.
			 									develop rest APIs/ web services with RestController.
		 										Build a crud interface to the database with spring rest.
		 										to know more about rest then go check the picture and check for more info
			 							
				 							lets look at the bussiness problem, what are we acctually trying to solve here:
				 							we want to build a client app that provides the weather report for a city so we will need to get the
				 							weather data from an external service,we dont have a local database for weather because it changes all
				 							the time so we will need to get that from an external service.
				 							REST stands for representational state transfer which is a lightweight approch for communicating between
				 							applications.REST is laguage independent and we can use any language that we want.
				 							the client applcation can use any language that it wants and the server application can also use any language 
				 							that we want. the data format that is being used is XML and JASON(JavaScriptObject Notation)
				 							we can use free weather service provided by openweathermap.org. so again the good
				 							this weather service is external and we can build client app using spring mvc, c# app
				 							,iphone app , we can use any language that we want. some other examples are such as 
				 							we can use to create currency converter app. what do we call it?? rest appi, rest webservices
				 							or any other names given to it is correct, the only thing we need to know is that we 
				 							are building an api , we are building a service and we are providing an in point
				 							and we are providing data based on inputs or requests and so on
				 							 
				 				27_JASON overview		
					 					jason means javascript object notation,it is just a lightweight dataformat for exchaning data, its just plain text
					 					that any programming language can use and read.   
					 					Simple jason example:(take a look at pictures file in the folder of 57 )
					 						*curly braces to define objects in jason
					 						*object members are name/value pairs
					 						*delimited by colons
					 						*name is always in double-qoutes
			 						
			 						27.1_java jason data binding
			 							data binding is the process of converting jason to java pojo(In software engineering, a plain old Java object (POJO) 
			 							is an ordinary Java object, not bound by any special restriction and not requiring any class path) or the other way around.
			 							to elaborate, it will read the contents of the jason sream or file, and then populate the java
			 							obejct with the given data. this whole process is called data binding.
			 							jason data binding with jackson.spring uses the jackson project behind the scenes
			 							jackson databinding by default uses getter and setter methods to do the data bindings
			 							so jason to java pojo they will called the setter methods.and java pojo to jason we will call the getter methods
		 								
		 							 
		 							
		 							28_ convert jason to java pojo
		 									development process:
		 										28.1_ download and import maven starter files
		 											http://www.luv2code.com/jackson-databinding-json-demo download this zip file
		 											and then import the unziped file to eclipse as a maven project
		 											this is the directory in my computer (D:\WorkSpaces\udemy\spring rest zip files\jackson-databinding-json-demo)
		 													
		 										28.1_ add maven dependency for jackson porject
		 												to add these dependencies we will have to go to http://search.maven.org
		 												and find them from this maven hub,we need to search jackson-databind
		 												 then we find com.fasterxml.jackson.core:jackson-databind and add that to the pom file
		 										28.1_ create student pojo java class
		 												the package this class is in is named(com.luv2code.jackson.json.demo)
		 										28.1_create main driver app
		 							
		 							
		 							 29_Spring REST-http overview (rest http basics)
		 							 		most common use of rest is over http so we can leverage http methods for crud operations
 		 							 
 		 							 30_ creating a Spring REST controller
 		 							 		spring  web mvc provides support for spring rest
 		 							 		
 		 							 		new annotation @RestController
 		 							 		Extension of Controller
 		 							 		Handles Rest requests and responses
 		 							 			
		 		 							 			*we can make use of the web browser or postman(rest client testing tool)
		 		 							 			*if we are just simple rest testing, for get request, we can use both postman and web browser
		 		 							 			*but for advanced rest testings like post, put and etc... postman has much better support
		 		 							 					*for example if we  are posting jason data,setting content type, passing http request headers , authentication etc...
		 		 							 					*then we will have to make use of postman client testing tool
		 		 							 			
		 							Spring rest development process
		 							 	 30.1_ 	we have to add maven dependency for spring mvc and  jackson project.
		 							 	 			we already have the the files ready and we just need to download them from the web
		 							 	 			and import the extracted file of the zip in this link( http://www.luv2code.com/spring-rest-demo)
													
		 							 	 			
		 							 	 30.2_ we need to add all java code for Config: @Configuration class		
		 								 30.3_ add code for all java config: servlet Intitializer
		 								 30.4_ create spring REST service using @RestControl
										 
										 
											*one thing that we need to keep in mind is that after creating all the steps above and run the 
											project on server, then we will run into a problem and we will get the error of 404.
											so first we wil fix that by only adding the test/hello to the url, but to really get rid of 
											it we will need to create a new jsp page which the tomcat server automatically will load it 
											the firt thing and then give then in that jsp page we will give an anchor tag and in that anchor
											tag we will give the path of test/hello so by doing this, when we run the server, we will not phase the
											error once we faced when  we ran the project at the start. one more thing we will see is that a red x 
											on the jsp file that we just created, to know the problem we go to eclipse markers and then look the porblem up
											and we can see that the problem is javax.servlet.jsp cannot be resolved to a type, so to get rid of this
											problem we will make a modification to our pom.xml file and a new entry for that support we will copy the 
											servlet dependency and paste it right below the other one and then we will add dependency for jsp support to
											the new servlet dependancy
											
									31_	Spring rest service (retreive pojo as jason)
										 	 development process:
										 	 	31.1_ create java pojo class for student(in com.luv2code.springdemo.entity package)
										 	 	31.2_ create spring rest service using @RestController(StudentRestController class in com.luv2code.springdemo.rest package)
										 	 	
		 							 32_ spring rest using @PathVariables for rest endpoints
		 							 		developemnt process
		 							 			32.1_ Add request mapping to spring rest service 
		 							 				build path variable t method parameters using @PathVariable.
		 							 				so  basically we will refactor our StudentRestController.
		 							 				so what we do is we define a field in that class and load that 
		 							 				field such that we only need to load the field once and do that
		 							 				only one time.
		 							 				
		 							 				*after finishing the project and running it, in the 
		 							 				*browser bar we will get http://localhost:8080/spring-rest-demo/
		 							 				*so to get the other things we want in the controller class we will have to add the 
		 							 				*other paths  which are in the controller class  such as this http://localhost:8080/spring-rest-demo/api/students/0 
		 							 
		 							 
		 							 33_ Spring Rest exception  handling
				 							 	for the pervious part, if we add an id which we do not have in out system,
				 							 	then we will get an error because we asked to get the details of id which is not in our data
				 							 	for example 999. so what we want to do is handle the exception and return the error as json
				 							 	
				 							 	development porcess:
				 							 		33.1_ create a custom error response class(StudentErrorResponse class in com.luv2code.springdemo.rest package)
				 							 				the custom error response class will be sent back to client as jason.
				 							 				we will define a as java pojo class.
				 							 				jackson will handle converting it to jason
				 							 		33.2_ create a custom exception class: StudentNotFoundException class (in com.luv2code.springdemo.rest package)
				 							 	    33.3_ update rest sevrice to throw exception if  student is not found(in StudentRestController class)
				 							 		33.4_ add an exception handler method using @ExceptionHandler(in StudentRestController class)
		 							 				
		 							 			*after making the classes for handling the error customly, if we add characters for a student id that does not 
		 							 			*exists we have same problem here, get the same error as we got before when we didnt customize our error for handling
		 							 			*the error .now we will have to modify our code to make sure that it will also gives the custom error when we enter.
		 							 			*so what we need to do it we need to modify our code to handle generic exceptions(any kind of exceptions) 
		 										*we go our StudentRestController class and add another handler
		 									
		 										*33.5_ after adding the exception handler, we know that the exception
		 										*handler we added is just for the StudentRestController, but in 
		 										*large porjects we can have so many RestControllers so we will have to make use of 
		 										*global exception handlers and in spring we will make use of @ControllerAdvice and it is simillar to a filter
		 												*so it pre-process requests to controllers
		 												*post-process responses to handle exceptions
		 												*perfect for global exception handling 
		 										
		 										33.5_ Global Exception handling development process
		 											33.5.1_ Create New @ControllerAdvice( StudentRestExcectionHandler class in com.luv2code.springdemo.rest package )
		 											33.5.2_ Refactor Rest Service...remove exception handling code 
		 											33.5.3_ Add exception handling code to @ControllerAdvice
		 							 		
		 							 	
		 							 	24_ Spring Rest API design		 
		 							 		for real time projects,we need to know who's going to use or API and how they are going to use our API
		 							 		and then we need to design our api based on the requirements
		 							 			API design process:
		 							 				24.1_ review API requirements
		 							 					lets say we recieved an email from the boss that says creat a rest API fpr the Customer Relation Managment(CRM) system
		 							 						rest clients should be able to:
		 							 							*get list of customers
		 							 							*get a single customer by id
		 							 							*add a new customer
		 							 							*update a new customer
		 							 							*delete a customer
		 							 							
		 							 				24.2_ identify main resource/entity
		 							 					so basically what we want to is to look for most important noun in the requirements documents. so for our project
		 							 					the most important noun is customer, because we saw that over and over again. so basically for our endpint we would
		 							 					have /api/customers . now this is not a hard and fast rule but this is the general convention
		 							 					
		 							 				24.3_ Use HTTP methods to design action on resource (this is the best practice used on real time projects)
		 							 						
		 							 							HTTP method 			CRUD Action
		 							 								
		 							 								POST				create a new ent
		 							 								GET					Read a list of entities or single entity
		 							 								PUT					update an existing entity
		 							 								DELETE				delete an existing entity
		 							 		
		 							 		
		 											
		 											 						CRUD endpoint Examples
		 											 
		 											 HTTP method           		    End point  				CRUD Action
		 												
		 												POST				   /api/customers			Create Cusotmer				
		 												
		 												GET			     	   /api/customers			Read a list of customers					
		 												 
		 												GET					/api/customers/{customerId}   read a single customer
		 												
		 												PUT					   /api/customers			  update an existing customer
		 												
		 												DELETE				  /api/customers/{customerId}   Delete customer 
	 										
	 											  
	 										24.4_ Some other real world spring API Examples:
	 												PayPal (check the pictures folder for thiss in 62)
	 												
	 												GitHub (check the pictures folder for thiss in 62)
	 												
	 												SalesForces  (check the pictures folder for thiss in 62)
	 												
	 											
	 									25_ Spring REST CRUD database project:
	 										project SetUp:
	 											we will download a maven starter Project that includes the followings we download
	 											 it from (http://www.luv2code.com/spring-crm-rest-demo) and import it as a maven existing project into eclipse
												CustomerService,CusotmerDAO and customer entity.
	 											we have created this project already.
	 											this will allows us to focus on creating CRM REST Service
	 													*code review for the downloaded and added project to our eclipse
	 													*(spring-rest-demo)
	 															*pom.xml file(the explainations are int he pom.xml code for each dependency)
	 															*All Java Config(package name is com.luv2code.springdemo.config)
	 															*Configuration for database connection
	 															*Hibernate Entity class:Customer (in com.luv2code.springdemo.entity package )
	 															*DAO: CustomerDAO (com.luv2code.springdemo.dao package)
	 															*Service:CustomerService...(in com.luv2code.springdemo.service package
	 															*)
	 															*one more thing to keep in mind is that there is a index.jsp file under webapp and
	 															*that is the page which first opens up when we run the project
	 												
	 											Development process
	 												25.1_ Get Customers
	 														Application interaction:we will have our rest client, and Customer rest controller and we 
	 														will make a get resquest(get/api/customers) and then we will return json which is the 
	 														list of the customers. as far as the application architecture, we will reuse our existing
	 														codes(Customer service ,customer DAO),and then we  will add this new portion(Customer REST Controller)
	 															Development process
	 																25.1.1_ Create Customer REST Controller(we will create a new package(com.luv2code.springdemo.rest) 
	 																and in that package will create our CustomerRestController  )
	 																25.1.2_ Autowire CustomerService
	 													 			25.1.3_add mapping for GET/customers
	 													 	when all of these are done i will just add a link in the index.jsp page to
	 													 	just when we click on that link it will give us the link to get all the cusotmers
	 													 	
	 													 			
	 												25.2_ get single customer by ID
	 														we add the mapping and method for it in CustomerRestController
	 														after adding it now lets try to break it by giving an id that does not exist or bad data.
	 														for this if we enter some bad data or an id that does ot exsists in the database, then
	 														it will return a blank page, in  java it is null but since it is being changed to json, it will return
	 														an empty body, and not the scary ugly exception error. what we want is to get an custom error exception
	 														to be returned when the id is not found.what we need to do is  we need to refactor  our code 
	 														and make it to throw an exception when the customer is not found in CustomerRestController class and also
	 														we will have a problemw we enter textes and characters for the customer id, we can sovle this by adding 
	 														a generic exception here to catch all the errors
	 															Development process for error exception handling:
	 																25.2.1_ Create a custom error response class (in com.luv2code.springdemo.rest package)
	 																25.2.2_Create custom exception class (in com.luv2code.springdemo.rest package)
	 																		after giving its name then what we do is we will click on browse button and then
	 																		we will sreach for runtime exception and choose it and also click on custructors from
	 																		superclass and then hit finish
	 																25.2.3_ Update rest service to throw exception if the customer is not found
	 																25.2.4_ add an exception handler using @ExcetionHandler( create a new class(CusomerRestExceptionHandler)
	 																 		in com.luv2code.springdemo.rest package)
	 												
	 												25.3_ add or create a new customer using REST API
	 														so here for this we will have to make use of a new annotation called @RequestBody
	 														and jackson will convert this request body from json to java pojo and this annotation binds the pojo
	 														to a method parameter in our controller.there is one thing in CustomerRestController class which is
	 														the id has been set to zero and the reason for that is becauswe our backend dao code uses hibernate
	 														method which is(session.saveOrUpdate()). now recall CustomerDAOImpl which is a backend code. the way
	 														that saveOrUpdate() method works is that basically it checks the primary key or id, if the primary key or
	 														id is empty, it will actually perform it will perform an insert on the new customer, else it will perform an update
	 														on the existing customer, so here empty means null or zero, so if we set the id it will perform an
	 														insert, else it will perform an update and that is how hibernate method works. so in this code
	 														theCustomer.setId(0); is zero tp the DAO code will perform an insert of the new customer
	 														
	 														25.3.1_ Add Mapping for POST/customers - add new customer(in CustomerRestController )
	 																now  we copy the link and paste it in postman and then we change the method to 
	 																POST and give this url to it http://localhost:8080/spring-crm-rest/api/customers
	 																then  we click on the body which is next to headers then choose raw and choose json
	 																
	 																
	 																
	 												25.4_ Update exisiting customer
	 														we will make use of PUT method to update a customer, and also we will specify the id 
	 														so we will tell it to update the customer with the id of 1 or 2 or 3.
	 														we will make use of @PutMapping  in CustomerRestController.
	 														after all is done we will paste this url in postman and then for the thing
	 														to the left the place of url we will choose for update
	 														
	 												25.5_ delete an existing customer	
	 														 so sale as before we will add our mapping for delete customer in CustomerRestController
	 														 we will refactor our code a little bit. so what we do is we check if the customer exists 
	 														 or not, if the cusotmer exists then we delete it, and of not then it throws  exception. so we want to 
	 														make sure that the customer is there before we delete it. then we swing back to postman and then we will
	 														choose delete as the method and and add the url http://localhost:8080/spring-crm-rest/api/customers/1
	 														and in the line above we are deleting the id of 1, and we can give it any id that we want to delete.
	 														
	 													
	 											
	 											
	 										 	
	 											 
	 											
	 				 
	 					
	 					
	
	 */

}
		
	 				 
	 					
	 					
	
	



