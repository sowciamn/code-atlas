# UserService

## Summary

* Package: `com.example.demo.service`
* Declaration: `CLASS`
* Type: `SERVICE`
* Source: `src/main/java/com/example/demo/service/UserService.java`

## Role

このクラスは `@Service` が付与されているため、業務ロジックコンポーネントです。

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

## Method Call Relations

### Outgoing Calls

| Target | Expression |
| --- | --- |
| - | - |

### Incoming Calls

| Source | Expression |
| --- | --- |
| [UserController](UserController.md).create | `userService.create(request)` |
| [UserController](UserController.md).findAll | `userService.findAll()` |
| [UserController](UserController.md).findById | `userService.findById(id)` |

## Method Calls

### Project Calls

| Source Method | Scope | Resolved Target | Called Method | Expression |
| --- | --- | --- | --- | --- |
| - | - | - | - | - |

### Library / Utility Calls

Library / Utility calls are omitted from this page. Count: 1.

## Related Classes

### Outgoing References

| Target | Relation | Member |
| --- | --- | --- |
| [UserDto](UserDto.md) | METHOD_PARAMETER | request |
| [UserDto](UserDto.md) | METHOD_RETURN_TYPE | create |
| [UserDto](UserDto.md) | METHOD_RETURN_TYPE | findAll |
| [UserDto](UserDto.md) | METHOD_RETURN_TYPE | findById |

### Incoming References

| Source | Relation | Member |
| --- | --- | --- |
| [UserController](UserController.md) | CONSTRUCTOR_PARAMETER | userService |
| [UserController](UserController.md) | FIELD | userService |
