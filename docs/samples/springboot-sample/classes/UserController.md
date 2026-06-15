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

## Method Call Relations

### Outgoing Calls

| Target | Expression |
| --- | --- |
| [UserService](UserService.md).create | `userService.create(request)` |
| [UserService](UserService.md).findAll | `userService.findAll()` |
| [UserService](UserService.md).findById | `userService.findById(id)` |

### Incoming Calls

| Source | Expression |
| --- | --- |
| - | - |

## Method Calls

### Project Calls

| Source Method | Scope | Resolved Target | Called Method | Expression |
| --- | --- | --- | --- | --- |
| create | userService | UserService | create | `userService.create(request)` |
| findAll | userService | UserService | findAll | `userService.findAll()` |
| findById | userService | UserService | findById | `userService.findById(id)` |

### Library / Utility Calls

Library / Utility calls are omitted from this page. Count: 0.

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
