Um diese Anwendung selber kompilieren zu k�nnen, muss die util.jar in die Projekte pvr master und pvr worker eingebunden werden.

Um die Anwendung auszuf�hren, m�ssen zuerst alle Instanzen der Worker mit ihrer Portnummer als Parameter, sowie main.Main als Hauptklasse gestartet werden.
Beispiel:
java -jar worker.jar 8000

Anschlie�end kann der Master gestartet werden. Eine �bersicht �ber alle Parameter kann in der Ausarbeitung im Anhang D gefunden werden.
Eine Beispielkonfiguration mit zwei Workern l�sst mit dem unten stehenden Befehl starten:

java -jar master.jar -x 100 -y 100 -z 100 -left 100 -right 0 -top 0 -bottom 0 -front 0 -back 0 -inner 0 -alpha 0.1 -type border -n localhost:8000 -n localhost:8010 -i 100

