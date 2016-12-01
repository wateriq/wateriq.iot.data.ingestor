(ns iot-data-ingestor.core
  (:gen-class))

(defn -main
  "iot-data-ingestor"
  [& args]
  (println (str "iot-data-ingestor " (clojure.string/join ", " args))))
