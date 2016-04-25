/*
 * IconFactory.java
 *
 * This file is part of TDA - Thread Dump Analysis Tool.
 *
 * TDA is free software; you can redistribute it and/or modify
 * it under the terms of the Lesser GNU General Public License as published by
 * the Free Software Foundation; either version 2.1 of the License, or
 * (at your option) any later version.
 *
 * TDA is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * Lesser GNU General Public License for more details.
 *
 * You should have received a copy of the Lesser GNU General Public License
 * along with TDA; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 *
 * $Id: IconFactory.java,v 1.2 2008-03-12 09:50:53 irockel Exp $
 */
package com.pironet.tda.utils;

import com.pironet.tda.TDA;

import javax.swing.Icon;

/**
 * icon factory for the tree icons.
 *
 * @author irockel
 */
public class IconFactory {
    public static IconFactory iconFactory;

    public static final int THREADS = 0;
    public static final int THREADS_WAITING = 1;
    public static final int THREADS_SLEEPING = 2;
    public static final int THREADS_LOCKING = 3;
    public static final int DEADLOCKS = 4;
    public static final int DIFF_DUMPS = 5;
    public static final int MONITORS = 6;
    public static final int MONITORS_NOLOCKS = 7;
    public static final int CUSTOM_CATEGORY = 8;

    private final Icon[] icons = {TDA.createImageIcon("Threads.gif"),
            TDA.createImageIcon("ThreadsWaiting.gif"),
            TDA.createImageIcon("ThreadsSleeping.gif"),
            TDA.createImageIcon("ThreadsLocking.gif"),
            TDA.createImageIcon("Deadlock.gif"),
            TDA.createImageIcon("DiffDumps.gif"),
            TDA.createImageIcon("Monitors.gif"),
            TDA.createImageIcon("Monitors-nolocks.gif"),
            TDA.createImageIcon("CustomCat.gif")
    };

    public static IconFactory get() {
        if (iconFactory == null) {
            iconFactory = new IconFactory();
        }

        return (iconFactory);
    }

    private IconFactory() {
        // private empty constructor
    }

    public Icon getIconFor(int index) {
        return (icons[index]);
    }

}
