
# PokeDex: A simple Pokemon Catalog

PokeDex is a pokemon catalog built as an Android application developed using Jetpack Compose and adhering to modern development practices. It follows a modular architecture, implements the MVI pattern, and leverages Coroutines, Flow, Retrofit, and Gradle's Version Catalog.
 # Technology Stack
The application is built using cutting-edge Android technologies, encompassing: 

* Entirely coded in [Kotlin](https://www.google.com)
* [Jetpack compose](https://developer.android.com/jetpack/compose)  for constructing user interfaces and app components
* [Retrofit](https://square.github.io/retrofit/) & [OKHttp](https://square.github.io/okhttp/) for handling network requests
* [Moshi](https://github.com/square/moshi) a JSON parsing library for mapping data to Kotlin objects
* [Corotines](https://kotlinlang.org/docs/coroutines-overview.html) and [Flows](https://kotlinlang.org/api/kotlinx.coroutines/kotlinx-coroutines-core/kotlinx.coroutines.flow/-flow/) for managing asynchronous operations
* [Paging3](https://developer.android.com/topic/libraries/architecture/paging/v3-overview) for efficient loading and displaying of data from APIs
* [Hilt](https://developer.android.com/training/dependency-injection/hilt-android) dependency injection
* [Turbine](https://github.com/cashapp/turbine) a lightweight testing utility for kotlinx.coroutines [Flow](https://kotlinlang.org/api/kotlinx.coroutines/kotlinx-coroutines-core/kotlinx.coroutines.flow/-flow/)
* [MockK](https://mockk.io/) a mocking framework for Kotlin
* [Gradle version Catalog](https://docs.gradle.org/current/userguide/platforms.html) for streamlined dependency management

# Architecture and patterns
PokeTracker employs Clean Architecture principles, comprising three distinct layers: Data, Domain, and Presentation. The MVVM pattern is followed throughout. Each layer is highly decoupled and operates independently.

Communication between layers adheres to a unidirectional flow. The UI layer dispatches user actions as intents to the ViewModel, which interacts with the Domain layer and subsequently the Data layer. Data is exposed across layers through data streams.

## Screenshots



