# UNO-Help (MMS SS2021)
## Projektbeschreibung
Realisert werden soll ein System, das mithilfe eines Smartphones per Kamera UNO®-Spielkarten erkennt.
Der Spieler soll am Anfang des Sieles die gegebenen Karten einscanen, welche auf ein "Deck" gelegt werden. Wenn der Spieler am zug ist, wird die aktuelle Karte vom Stapel eingescannt und die App soll dann anzeigen, welche Karten für den Zug möglich sind.

## Zielformulierung
Das Scannen der Spielkarten soll eine virtuelle Spielsession ermöglichen. Damit ist immer eine momentane Lage des Spieles sichtbar. Somit kann in Kombination mit der Darstellung der gespielten Karten immer ein möglichst schlauer Weg für den nächsten Spielzug ermittelt werden.

## Realisierung
Am Anfang müssen alle Karten gescannt werden, die der Spieler erhält.
Wenn der Spieler an der Reihe ist, wird die oberste Karte des Ablagestapels gescannt und die App zeigt, welche Karten darauf abgelegt werden können. Das Scannen soll entweder per Bildererkennung oder mittels QR-Code erfolgen. Der Spieler klickt dann die Karte, die er ablegen will an und diese verschwindet anschließend von dem “Stack”. Sollte keine der Karten im Besitz passen, so wird dem Benutzer angezeigt, dass eine Karte gezogen und gescannt werden muss. Wenn es nur mehr eine Karte im Stack gibt, dann wird der Benutzer daran erinnert “UNO” zu sagen.

https://imgur.com/a/9jTqVKl