# UserController

## Summary

* Package: `com.example.demo.controller`
* Declaration: `CLASS`
* Type: `CONTROLLER`
* Source: `src/main/java/com/example/demo/controller/UserController.java`

## Annotations

* `RestController`
* `RequestMapping`

## Methods

| Method | Return Type | Parameters | Annotations |
| --- | --- | --- | --- |
| findAll | `List<UserDto>` |  | GetMapping |
| findById | `UserDto` | Long id | GetMapping |
| create | `UserDto` | UserDto request | PostMapping |

## Fields

| Name | Type | Annotations |
| --- | --- | --- |
| userService | `UserService` |  |

## Related Classes

### Outgoing References

| Target | Relation | Member |
| --- | --- | --- |
| UserDto | METHOD_PARAMETER | request |
| UserDto | METHOD_RETURN_TYPE | create |
| UserDto | METHOD_RETURN_TYPE | findAll |
| UserDto | METHOD_RETURN_TYPE | findById |
| UserService | CONSTRUCTOR_PARAMETER | userService |
| UserService | FIELD | userService |

### Incoming References

| Source | Relation | Member |
| --- | --- | --- |
| - | - | - |
