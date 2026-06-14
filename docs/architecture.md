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
| UserController | UserDto | METHOD_PARAMETER | request |
| UserController | UserDto | METHOD_RETURN_TYPE | create |
| UserController | UserDto | METHOD_RETURN_TYPE | findAll |
| UserController | UserDto | METHOD_RETURN_TYPE | findById |
| UserController | UserService | CONSTRUCTOR_PARAMETER | userService |
| UserController | UserService | FIELD | userService |
| UserService | UserDto | METHOD_PARAMETER | request |
| UserService | UserDto | METHOD_RETURN_TYPE | create |
| UserService | UserDto | METHOD_RETURN_TYPE | findAll |
| UserService | UserDto | METHOD_RETURN_TYPE | findById |
