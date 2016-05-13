{:repl {:plugins [[cider/cider-nrepl "0.11.0"]
                  [refactor-nrepl "2.0.0"]]
        :jvm-opts ["-Xmx2g"
                   "-Xms2g"
                   "-XX:+CMSClassUnloadingEnabled"
                   "-XX:MaxPermSize=2g"]
        :repl-options {:timeout 120000}}
 :user {:dependencies [[inspector-jay "0.3"]]
        :plugins [[lein-try "0.4.3"]]}}
