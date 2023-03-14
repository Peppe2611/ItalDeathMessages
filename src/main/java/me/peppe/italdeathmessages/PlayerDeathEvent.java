package me.peppe.italdeathmessages;

import org.bukkit.Server;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDeathEvent;

import java.util.Random;

import static org.bukkit.Bukkit.getServer;

public class PlayerDeathEvent implements Listener {
    @EventHandler
    public void onPlayerDeath(EntityDeathEvent e) {
        Entity ent = e.getEntity();
        Player ent2 = e.getEntity().getKiller();
        EntityDamageEvent ede = ent.getLastDamageCause();
        EntityDamageEvent.DamageCause dc = ede.getCause();
        if (ent instanceof Player && dc == EntityDamageEvent.DamageCause.PROJECTILE) {
            Player p = (Player) ent;
            Server server = getServer();
            Random rand = new Random();
            int randnum = rand.nextInt(3);
            switch (randnum) {
                case 0:
                    server.broadcastMessage("§f>> " + "§c" + p.getName() + " §7 e' stato cecchinato da" + "§c " + ent2.getName());
                    break;
                case 1:
                    server.broadcastMessage("§f>> " + "§7 La testa di" + " §c " + p.getName() + " §7e' stata accarezzata dalla freccia di" + "§c " + ent2.getName());
                    break;
                case 2:
                    server.broadcastMessage("§f>> " + "§c" + p.getName() + " §7 non e' riuscito a scappare dalle frecce di" + "§c " + ent2.getName());
                    break;
            }

        }
        if (ent instanceof Player && dc == EntityDamageEvent.DamageCause.ENTITY_ATTACK) {
            Player p = (Player) ent;
            Server server = getServer();
            server.broadcastMessage("§f>> " + "§c" + ent2.getName() + " §7 ha ucciso" + "§c " + p.getName());
        }
        if (ent instanceof Player && dc == EntityDamageEvent.DamageCause.FALL) {
            Player p = (Player) ent;
            Server server = getServer();
            Random rand = new Random();
            int randnum = rand.nextInt(3);
            switch (randnum) {
                case 0:
                    server.broadcastMessage("§f>> " + "§c" + p.getName() + " §7non ha retto la caduta");
                    break;
                case 1:
                    server.broadcastMessage("§f>> " + "§c" + p.getName() + " §7voleva diventare un volatile");
                    break;
                case 2:
                    server.broadcastMessage("§f>> " + "§c" + p.getName() + " §7si e' spiaccicato al suolo");
                    break;
            }
        }
        if (ent instanceof Player && dc == EntityDamageEvent.DamageCause.DROWNING) {
            Player p = (Player) ent;
            Server server = getServer();
            Random rand = new Random();
            int randnum = rand.nextInt(3);
            switch (randnum) {
                case 0:
                    server.broadcastMessage("§f>> " + "§c" + p.getName() + " §7e' affogato");
                    break;
                case 1:
                    server.broadcastMessage("§f>> " + "§c" + p.getName() + " §7ha fatto un lunghissimo bagno");
                    break;
                case 2:
                    server.broadcastMessage("§f>> " + "§c" + p.getName() + " §7e' andato a far visita ai pesci");
                    break;
            }
        }
        if (ent instanceof Player && dc == EntityDamageEvent.DamageCause.LAVA) {
            Player p = (Player) ent;
            Server server = getServer();
            Random rand = new Random();
            int randnum = rand.nextInt(3);
            switch (randnum) {
                case 0:
                    server.broadcastMessage("§f>> " + "§c" + p.getName() + " §7ha fatto un bagno nella lava");
                    break;
                case 1:
                    server.broadcastMessage("§f>> " + "§c" + p.getName() + " §7aveva molto caldo");
                    break;
                case 2:
                    server.broadcastMessage("§f>> " + "§c" + p.getName() + " §7si e' carbonizzato");
                    break;
            }

        }
        if (ent instanceof Player && dc == EntityDamageEvent.DamageCause.FIRE) {
            Player p = (Player) ent;
            Server server = getServer();
            Random rand = new Random();
            int randnum = rand.nextInt(3);
            switch (randnum) {
                case 0:
                    server.broadcastMessage("§f>> " + "§c" + p.getName() + " §7e' diventato una torcia");
                    break;
                case 1:
                    server.broadcastMessage("§f>> " + "§c" + p.getName() + " §7aveva molto caldo");
                    break;
                case 2:
                    server.broadcastMessage("§f>> " + "§c" + p.getName() + " §7si e' carbonizzato");
                    break;
            }
        }
        if (ent instanceof Player && dc == EntityDamageEvent.DamageCause.FIRE_TICK) {
            Player p = (Player) ent;
            Server server = getServer();
            Random rand = new Random();
            int randnum = rand.nextInt(3);
            switch (randnum) {
                case 0:
                    server.broadcastMessage("§f>> " + "§c" + p.getName() + " §7e' diventato una torcia");
                    break;
                case 1:
                    server.broadcastMessage("§f>> " + "§c" + p.getName() + " §7aveva molto caldo");
                    break;
                case 2:
                    server.broadcastMessage("§f>> " + "§c" + p.getName() + " §7non e' riuscito a spegnere in tempo le fiamme");
                    break;
            }
        }
    }
}
