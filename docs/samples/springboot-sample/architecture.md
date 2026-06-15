# Architecture

## Application

* [DemoApplication](classes/DemoApplication.md)

## Controller

* [UserController](classes/UserController.md)

## Service

* [UserService](classes/UserService.md)

## Repository

* [UserRepository](classes/UserRepository.md)

## Entity

* [User](classes/User.md)

## Configuration

None

## Component

None

## DTO

* [UserDto](classes/UserDto.md)

## Unknown

None

## Dependency Overview

| Source | Target | Relation | Member |
| --- | --- | --- | --- |
| [UserController](classes/UserController.md) | [UserDto](classes/UserDto.md) | METHOD_PARAMETER | request |
| [UserController](classes/UserController.md) | [UserDto](classes/UserDto.md) | METHOD_RETURN_TYPE | create |
| [UserController](classes/UserController.md) | [UserDto](classes/UserDto.md) | METHOD_RETURN_TYPE | findAll |
| [UserController](classes/UserController.md) | [UserDto](classes/UserDto.md) | METHOD_RETURN_TYPE | findById |
| [UserController](classes/UserController.md) | [UserService](classes/UserService.md) | CONSTRUCTOR_PARAMETER | userService |
| [UserController](classes/UserController.md) | [UserService](classes/UserService.md) | FIELD | userService |
| [UserService](classes/UserService.md) | [UserDto](classes/UserDto.md) | METHOD_PARAMETER | request |
| [UserService](classes/UserService.md) | [UserDto](classes/UserDto.md) | METHOD_RETURN_TYPE | create |
| [UserService](classes/UserService.md) | [UserDto](classes/UserDto.md) | METHOD_RETURN_TYPE | findAll |
| [UserService](classes/UserService.md) | [UserDto](classes/UserDto.md) | METHOD_RETURN_TYPE | findById |
