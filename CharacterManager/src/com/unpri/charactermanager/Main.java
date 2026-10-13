
package com.unpri.charactermanager;

import com.unpri.charactermanager.model.Character;
import com.unpri.charactermanager.model.CharacterType;

public class Main {

    public static void main(String[] args) {

        // Membuat tiga karakter utama
        Character warrior = new Character(
            "Aragorn", CharacterType.WARRIOR
        );

        Character mage = new Character(
            "Merlin", CharacterType.MAGE, 5
        );

        Character archer = new Character(
            "Legolas", CharacterType.ARCHER, 3
        );

        // Menampilkan data karakter
        System.out.println("=== DAFTAR KARAKTER ===");
        System.out.println(warrior);
        System.out.println(mage);
        System.out.println(archer);

        // Demo level up
        System.out.println("\n=== DEMO LEVEL UP ===");
        warrior.levelUp();
        mage.levelUp();

        System.out.println("\n=== SETELAH LEVEL UP ===");
        System.out.println(warrior);
        System.out.println(mage);

        // Poin 5: karakter baru untuk Mini-Challenge
        Character healer = new Character(
            "Aurora", CharacterType.HEALER, 2
        );

        healer.setMana(150);

        System.out.println("\n=== MINI-CHALLENGE ===");
        System.out.println(healer);
        System.out.println(
            "Mana Aurora: " + healer.getMana()
        );
        System.out.println(
            "Apakah Aurora masih hidup? " + healer.isAlive()
        );

        // Pengujian validasi mana negatif
        try {
            healer.setMana(-10);
        } catch (IllegalArgumentException e) {
            System.out.println(
                "Validasi berhasil: " + e.getMessage()
            );
        }
    }
}
