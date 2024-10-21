package com.github.affandes.kuliah.pm;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class BrowserHistory {
    private final List<String> history;

    // Konstruktor
    public BrowserHistory() {
        history = new ArrayList<>();
    }

    // Fungsi untuk menampilkan semua history browser
    public void view() {
        if (history.isEmpty()) {
            System.out.println("No browsing history.");
        } else {
            System.out.println("Browsing History (Most Recent First):");
            for (int i = history.size() - 1; i >= 0; i--) {
                System.out.println((history.size() - i) + ". " + history.get(i));
            }
        }
    }

    // Fungsi untuk menambahkan website baru ke dalam history
    public void browse(String website) {
        history.add(website);
        System.out.println("Visited: " + website);
    }

    // Fungsi untuk kembali ke website sebelumnya dan menghapus history terakhir
    public void back() {
        if (history.size() > 1) {
            String lastSite = history.remove(history.size() - 1);
            System.out.println("Going back from " + lastSite + " to " + history.get(history.size() - 1));
        } else if (history.size() == 1) {
            System.out.println("Only one site in history, can't go back: " + history.get(0));
        } else {
            System.out.println("No browsing history to go back.");
        }
    }

    // Main method untuk menjalankan simulasi
    public static void main(String[] args) {
        BrowserHistory browserHistory = new BrowserHistory();

        // Mengunjungi beberapa situs
        browserHistory.browse("example.com");
        browserHistory.browse("google.com");
        browserHistory.browse("stackoverflow.com");

        // Melihat semua history
        browserHistory.view();

        // Kembali ke situs sebelumnya
        browserHistory.back();

        // Melihat history setelah back
        browserHistory.view();
    }
}

