# clj-angjs
A Leiningen template for projects that use Clojure(Server Side) and AngularJS(Client Side), any HTML could be substituted for AngularJS.

Branch V2 is more compact and updated.

* [clj-angjs](http://yatesj9.github.io/clj-angjs/)

## Install

Clone the repo to a local folder.

	$ git clone https://github.com/yatesj9/clj-angjs.git

**Optional**

	$ lein install

Deploy the template with your own project name. **NOTE: make sure you are in the cloned folder for the next step.** 

	$ lein new clj-angjs <your new project name>

Once complete, copy the new folder with **'your new project name'** to any location.
	
## Usage

You can start the server from a **REPL**

```clojure
(require '[<your new project name>.repl :refer [start-server
	                                             stop-server]])
	                                                       
(start-server 3000) ;Port number must be included
(stop-server)
```

The template defaults to **public/app**, to serve up AngularJS or any HTML site. A good way to start is by using Yeoman <http://yeoman.io/>
	
	$ yo angular 
	

## License

Distributed under the Eclipse Public License, the same as Clojure.