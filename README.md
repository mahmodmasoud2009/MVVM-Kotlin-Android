[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-android--best--practices-brightgreen.svg?style=flat)](https://android-arsenal.com/details/3/4975)  [![kotlin](https://img.shields.io/badge/Kotlin-1.4.xxx-brightgreen.svg)](https://kotlinlang.org/)  [![coroutines](https://img.shields.io/badge/coroutines-asynchronous-red.svg)](https://kotlinlang.org/docs/reference/coroutines-overview.html)  [![Mockk](https://img.shields.io/badge/Mockk-testing-yellow.svg)](https://mockk.io/)      [![Junit5](https://img.shields.io/badge/Junit5-testing-yellowgreen.svg)](https://junit.org/junit5/)   [![Espresso](https://img.shields.io/badge/Espresso-testing-lightgrey.svg)](https://developer.android.com/training/testing/espresso/)  [![Dagger 2](https://img.shields.io/badge/Dagger-2.xx-orange.svg)](https://google.github.io/dagger/) (https://img.shields.io/badge/Kotlin--Android--Extensions-plugin-red.svg)](https://kotlinlang.org/docs/tutorials/android-plugin.html) [![MVVM ](https://img.shields.io/badge/Clean--Code-MVVM-brightgreen.svg)](https://github.com/googlesamples/android-architecture)  ![MVP ](https://img.shields.io/badge/Clean--Code-MVP-brightgreen.svg)
[![Build Status](https://app.bitrise.io/app/b7eabce000fac983/status.svg?token=i6oJjdA4ZD4wM6NDA5cB7g&branch=master)](https://app.bitrise.io/app/b7eabce000fac983)![MVVM3](https://user-images.githubusercontent.com/1812129/68319232-446cf900-00be-11ea-92cf-cad817b2af2c.png)

Model-View-ViewModel (ie MVVM) is a template of a client application architecture, proposed by John Gossman as an alternative to MVC and MVP patterns when using Data Binding technology. Its concept is to separate data presentation logic from business logic by moving it into particular class for a clear distinction.


**Why Promoting MVVM VS MVP:**
- ViewModel has Built in LifeCycleOwerness, on the other hand Presenter not, and you have to take this responsiblty in your side.
- ViewModel doesn't have a reference for View, on the other hand Presenter still hold a reference for view, even if you made it as weakreference.
- ViewModel survive configuration changes, while it is your own responsiblities to survive the configuration changes in case of Presenter. (Saving and restoring the UI state)

**MVVM Best Pratice:**
- Avoid references to Views in ViewModels.
- Instead of pushing data to the UI, let the UI observe changes to it.
- Distribute responsibilities, add a domain layer if needed.
- Add a data repository as the single-point entry to your data.
- Expose information about the state of your data using a wrapper or another LiveData.
- Consider edge cases, leaks and how long-running operations can affect the instances in your architecture.
- Don’t put logic in the ViewModel that is critical to saving clean state or related to data. Any call you make from a ViewModel can be the last one.


**What is Coroutines ?**
-------------------

 **Coroutines :**
Is light wight threads for asynchronous programming, Coroutines not only open the doors to
asynchronous programming, but also provide a wealth of other possibilities such as concurrency, actors, etc.

----------

**Coroutines VS RXJava**
-------------------
They're different tools with different strengths. Like a tank and a cannon, they have a lot of overlap but are more or less desirable under different circumstances.
        - Coroutines Is light wight threads for asynchronous programming.
        - RX-Kotlin/RX-Java is functional reactive programming, its core pattern relay on
        observer design pattern, so you can use it to handle user interaction with UI while you
        still using coroutines as main core for background work.

**How does Coroutines concept work ?**
------------
 - Kotlin coroutine is a way of doing things asynchronously in a sequential manner. Creating a coroutine is a lot cheaper vs creating a thread.


**When I can choose Coroutines or RX-Kotlin to do some behaviour ?**
--------------------------
 - Coroutines : *When we have concurrent tasks , like you would fetch data from Remote connections
 , database , any background processes , sure you can use RX in such cases too, but it looks like
  you use a tank to kill ant.*
 - RX-Kotlin : *When you would to handle stream of UI actions like : user scrolling , clicks ,
 update UI upon some events .....ect .*


**What is the Coroutines benefits?**
-----------------------------

 - Writing an asynchronous code is sequential manner.
 - Costing of create coroutines are much cheaper to crate threads.
 - Don't be over engineered to use observable pattern, when no need to use it.
 - parent coroutine can automatically manage the life cycle of its child coroutines for you.


**Handle Retrofit with Coroutines**
-----------------------------

![8399](data:image/png;base64,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)

 - Add Coroutines to your gradle file

>     // Add Coroutines
>     implementation 'org.jetbrains.kotlinx:kotlinx-coroutines-android:1.3.2'
>     implementation 'org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.2'
>     implementation 'org.jetbrains.kotlinx:kotlinx-coroutines-core-common:1.3.2'
>     // Add Retrofit2
>     implementation 'com.squareup.retrofit2:retrofit:2.6.2'
>     implementation 'com.squareup.retrofit2:converter-gson:2.6.2'
>     implementation 'com.squareup.okhttp3:okhttp:4.2.2'


 - Make Retrofit Calls.


```kotlin
    @GET("topstories/v2/home.json")
    suspend fun fetchNews(): Response<NewsModel>
```


 - With ```async``` we create new coroutine and returns its future result as an implementation of [Deferred].
 - The coroutine builder called ```launch``` allow us to start a coroutine in background and keep working in the meantime.
 - so async will run in background then return its promised result to parent coroutine which
 created by launch.
 - when we get a result, it is up to us to do handle the result.





```kotlin
    newsMutableLiveData.postValue(Resource.Loading())
        launch {
            try {
                serviceResponse = dataRepository.requestNews()
                newsMutableLiveData.postValue(serviceResponse)
            } catch (e: Exception) {
                newsMutableLiveData.postValue(Resource.DataError(NETWORK_ERROR))
            }
        }
  ```




**Keep your code clean according to MVVM**
-----------------------------
 - Yes , liveData is easy , powerful , but you should know how to use.
 - For livedate which will emit data stream , it has to be in your
   data layer , and don't inform those observables any thing else like
   in which thread those will consume , cause it is another
 - For livedata which will emit UI binding events, it has to be in your ViewModel Layer.
 - Observers in UI Consume and react to live data values and bind it.
   responsibility , and according to `Single responsibility principle`
  in `SOLID (object-oriented design)` , so don't break this concept by
   mixing the responsibilities .

  ![mvvm2](https://user-images.githubusercontent.com/1812129/68319008-e9d39d00-00bd-11ea-9245-ebedd2a2c067.png)

## LICENSE
Copyright [2022] [Mahmoud Masoud]
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
