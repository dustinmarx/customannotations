# customannotations
Custom Java Annotations

This repository contains simple Java annotations that might be useful in their own right, but which also demonstrate how easy it is to write Java annotations. The sample custom annotations include:
* [@Modified](https://github.com/dustinmarx/customannotations/blob/master/dustin/examples/annotations/Modified.java) - Indicates parameter to a method or constructor (ouch!) might/will be modified by that method or constructor (yucky).
* [@Preview](https://github.com/dustinmarx/customannotations/blob/master/dustin/examples/annotations/Preview.java) - Indicates construct that is only made available for early experimentation and may be changed or removed in the near future. This has some similarities in terms of concept and use to Guava's [@Beta](https://github.com/google/guava/blob/master/guava/src/com/google/common/annotations/Beta.java) annotation.
* [@TestOnly](https://github.com/dustinmarx/customannotations/blob/master/dustin/examples/annotations/TestOnly.java) - Indicates construct should only be used in testing scenarios and should NOT be used in production. This communication is a weak attempt to prevent misuse of constructs that are needed for test purposes and in which it's too difficult or too expensive to refactor the code or use test doubles to work only with production APIs and constructs. This has some similarities in terms of concept and use to Guava's [@VisibleForTesting](https://github.com/google/guava/blob/master/guava/src/com/google/common/annotations/VisibleForTesting.java) annotation.
* [@Unfinished](https://github.com/dustinmarx/customannotations/blob/master/dustin/examples/annotations/Unfinished.java) - Indicates construct that is partially completed but for which known functionality must still be implemented.

The blog post [What Might a New @Deprecated Look Like?](https://marxsoftware.blogspot.com/2015/11/what-might-new-deprecated-look-like.html) contains an example of a custom @Deprecated annotation that reflected the current proposal for enhanced deprecation at that time (the actual enhanced @Deprecation's improvements were much less ambitious).

See the [Google Annotations Gallery](https://code.google.com/archive/p/gag/) ('gag') for some humorous custom annotations that I sometimes wish I could use in production code!
