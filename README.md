starmade-universe-tool Deutsch
==============================

In einem Satz: 
Eine Bibliotiek um das Starmade Universum, mit hilfe einer Blocksprache, zu kontrollieren.

Begründung: 
Starmade ist ein Spiel welche auf vielen kleineren Serveren gehostet wird. Jeder dieser Server hat seine eigene Community und Eigenarten. So gibt es Server mit PvP und RPG und Server mit anderen Combinationen. Das eigetliche Gameplay dieser Server unterscheidet sich aber sehr stark. Auf PvP Servern werden kleine gebiete mit hohen Spielerzahlen benötigt z.B durch reiche Mining vorkommen. Auf PvM Servern werden entweder reiche Salvaging vorkommen benötigt oder für den Asiatischen markt reiche Grinding vorkommen wie Piraten, ohne dabei anderen Spielern in dem Weg zu stehen. Das bedeutet, dass sich das Universum den Spielerischen anforderungen anpassen muss.



starmade-universe-tool Englisch
===============================

In one sentence: 
A library to controle the Starmade univerese by using an cacading language.

Reason: 
Star-made is a game witch will played on several private or public servers. Each Server has its own community and prefferenzes of playing starmade. There are server without pvp or rpg and there are server who use other combinations. but the gameplay between this server could chance dramaticly. On a PvP server you need a few regions with concentrated player count. On an pvm Server you need the possibility to salvage or grind pirates without interfering with other players. Thats means. If you change the way to play on an Server, you have to set a different universe behavier to controle the players aktivitis.


Cascading universe language:

With the CUV you are able to describe the universe. (Were still in developing, these commands do net represend the CUV in release state, we need to talk with schema to get possible commands)

(EXAMPLES)
Controlling a Sektor:

#22,-4,5{
  randomBlueprint("asteroide.bp",0.2); //20% Wahrscheinlichkeit das dieses Blueprint auftaucht.
  name: Caldari prime; // Setzt den Sektor name z.B um Tradehubs etc zu markieren.
  
}
