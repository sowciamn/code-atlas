# UserService

## Summary

* Package: `com.example.demo.service`
* Declaration: `CLASS`
* Type: `SERVICE`
* Source: `src/main/java/com/example/demo/service/UserService.java`

## Annotations

* `Service`

## Methods

| Method | Return Type | Parameters | Annotations |
| --- | --- | --- | --- |
| findAll | `List<UserDto>` |  |  |
| findById | `UserDto` | Long id |  |
| create | `UserDto` | UserDto request |  |

## Fields

| Name | Type | Annotations |
| --- | --- | --- |
| - | - | - |

## Related Classes

### Outgoing References

| Target | Relation | Member |
| --- | --- | --- |
| UserDto | METHOD_PARAMETER | request |
| UserDto | METHOD_RETURN_TYPE | create |
| UserDto | METHOD_RETURN_TYPE | findAll |
| UserDto | METHOD_RETURN_TYPE | findById |

### Incoming References

| Source | Relation | Member |
| --- | --- | --- |
| UserController | CONSTRUCTOR_PARAMETER | userService |
| UserController | FIELD | userService |
