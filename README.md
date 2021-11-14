Sample spring boot project with maven config.

* Maven config (pom.xml) for Mapstruct along with lombok.
* Bean mapping scenarios - 
    * Same datatype
    * same variable name
    * Same datatype, different variable name
    * Ignore a variable in mapping
    * Different datatypes
        * int to string
        * string to int
        * Date to string
        * enum to string
    * single fields to multiple fields
    * Mapping of nested fields.
    * Denormalize to map value from a.b.c to a.d
    * setting a default value if a variable has null in input.
    * setting a constant value irrespective of the input value.
    * Mapping collections, maps, streams.
    * Define custom logic for mapping.
    * Update mapping method -  in place of creating a new object, mapping to update an existing object. Be careful with update methods. Default update code clears the collections/maps and adds all new values.
    * Reuse configuration with InheritConfiguration and InheritInverseConfiguration.
    * Callback methods in mapper - @BeforeMapping , @AfterMapping
* Mapper instance
    * create instance using factory method getMapper.
    * create spring bean and inject or autowire instance.