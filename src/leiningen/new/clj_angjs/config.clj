(ns {{ns-name}}.config)

(def mode (atom :development))

(defn get-mode
  []
  @mode)

(defn set-mode!
  [new-mode]
  (reset! mode new-mode))

(def ^:private dsettings {
     :server {
       :port 8989}
     :request {}})


(def ^:private opts {
  :development dsettings})

(defn get-settings
  [& selections]
  (let [choices (if ((first selections) opts)
                  selections
                  (cons @mode selections))]
    (get-in opts choices)))
