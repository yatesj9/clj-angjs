(ns {{ns-name}}.tests.config-tests
    (:require [{{ns-name}}.config :refer [get-mode
                                              set-mode!
                                              get-settings]])
    (:use [expectations]))

; --- Should return current mode, default :development--------------------------

(expect :development (get-mode))

; --- Should set mode to desired key--------------------------------------------

(expect :production (set-mode! :production))
(expect :development (set-mode! :development))

; --- Should return server port in dev settings---------------------------------

(expect 8989 (get-settings :server :port))

