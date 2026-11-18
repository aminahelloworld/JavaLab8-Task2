# Exercise 8 – Packages and Interfaces (Task 2)

Multi-level `Animal` hierarchy (Animal → Mammal/Bird/Fish → Dog/Pigeon/Blowfish) extended with three interfaces:

| Interface | Method type | Behaviour |
|---|---|---|
| `AnimalBehavior` | abstract `sleep()` | Must be implemented by Dog, Pigeon, Blowfish |
| `AnimalMove` | default `move()` | Inherited by all animals via `Animal`; overridden in Dog, Pigeon, Blowfish |
| `AnimalName` | static `name(String)` | Cannot be overridden; called on the interface: `AnimalName.name(...)` |
