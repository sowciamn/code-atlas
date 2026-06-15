# UserController

## Summary

* Package: `com.example.demo.controller`
* Declaration: `CLASS`
* Type: `CONTROLLER`
* Source: `src/main/java/com/example/demo/controller/UserController.java`

## Role

このクラスは `@RestController` が付与されているため、Web API Controllerです。

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

## Method Calls

| Source Method | Scope | Called Method | Expression |
| --- | --- | --- | --- |
| create | userService | create | `userService.create(request)` |
| findAll | userService | findAll | `userService.findAll()` |
| findById | userService | findById | `userService.findById(id)` |

## Related Classes

### Outgoing References

| Target | Relation | Member |
| --- | --- | --- |
| [UserDto](UserDto.md) | METHOD_PARAMETER | request |
| [UserDto](UserDto.md) | METHOD_RETURN_TYPE | create |
| [UserDto](UserDto.md) | METHOD_RETURN_TYPE | findAll |
| [UserDto](UserDto.md) | METHOD_RETURN_TYPE | findById |
| [UserService](UserService.md) | CONSTRUCTOR_PARAMETER | userService |
| [UserService](UserService.md) | FIELD | userService |

### Incoming References

| Source | Relation | Member |
| --- | --- | --- |
| - | - | - |
