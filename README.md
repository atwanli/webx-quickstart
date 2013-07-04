webx-quickstart
===============

maven project archetype

Webx 3的maven原型工程，用于快速创建项目

* food工程：

 含两个web/biz子工程，deploy工程负责打包，生成war和tar.gz包

 Webx和工程配置有待调整和完善

 启动后，可以通过下面到地址访问

 http://localhost:8080/index.htm

 http://localhost:8080/apple/index.htm
<pre>
.
├── assets
├── biz
│   ├── apple
│   │   └── src
│   │       ├── main
│   │       │   ├── java
│   │       │   └── resources
│   │       └── test
│   │           └── java
│   ├── banana
│   └── common
│       └── src
│           ├── main
│           │   ├── java
│           │   └── resources
│           └── test
│               └── java
├── deploy
│   └── src
│       └── main
│           ├── resources
│           │   └── web
│           │       └── common
│           └── webapp
│               ├── templates
│               │   ├── apple
│               │   │   ├── layout
│               │   │   └── screen
│               │   └── home
│               │       ├── layout
│               │       └── screen
│               └── WEB-INF
└── web
    ├── apple
    │   └── src
    │       └── main
    │           ├── java
    │           │   └── com
    │           │       └── mpfive
    │           │           └── food
    │           │               └── apple
    │           │                   └── web
    │           │                       └── module
    │           │                           └── screen
    │           └── resources
    │               └── web
    │                   └── apple
    ├── banana
    └── home
        └── src
            └── main
                ├── java
                │   └── com
                │       └── mpfive
                │           └── food
                │               └── home
                │                   └── web
                │                       └── module
                │                           └── screen
                └── resources
                    └── web
                        └── home
</pre>
* TODO
