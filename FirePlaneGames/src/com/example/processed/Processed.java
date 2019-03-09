/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.processed;

import com.example.data.Player;
import com.example.data.Position;
import com.example.userinterface.TablePosition;
import java.util.ArrayList;

/**
 *
 * @author pumba
 */
public class Processed {

    private Player myPlayer;
    private Player enemyPlayer;
    private int countCol = TablePosition.COUNT_COLUMN;

    public Processed() {
    }

    public Processed(Player myPlayer, Player enemyPlayer) {
        this.myPlayer = myPlayer;
        this.enemyPlayer = enemyPlayer;
    }

    public Player getMyPlayer() {
        return myPlayer;
    }

    public Player getEnemyPlayer() {
        return enemyPlayer;
    }

    public void hintsLog(Position position, ArrayList<Position> alPosition) {
//        int fireCell = 15;
//        int[] plane = {26};
//        if (hintsLogNo1(fireCell, plane)) {
//            System.out.println("Enermy Plane stay in area 3x3");
//        }
        if(hintsLogNo1(position, alPosition)){
            System.out.println("Enermy Plane stay in area 3x3");
        }
    }

//    private boolean hintsLogNo1(int fireCell, int[] plane) {
//        for (int i : plane) {
//            if ((fireCell - countCol < i) && (i < fireCell + countCol)) {
//                if (fireCell == (i + 1) || fireCell == (i - 1)) {
//                    return true;
//                }
//                if (fireCell == (i - countCol + 1) || fireCell == (i - countCol) || fireCell == (i - countCol + 2)) {
//                    return true;
//                }
//                if (fireCell == (i + countCol - 1) || fireCell == (i + countCol - 2) || fireCell == (i + countCol)) {
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
    
    private boolean hintsLogNo1(Position position, ArrayList<Position> alPosition){
        
        for(Position p : alPosition){
            if(position.getColumn() - 1 <= p.getColumn() && p.getColumn() <= position.getColumn() + 1){
                if(position.getRow()- 1 <= p.getRow()&& p.getRow() <= position.getRow()+ 1){
                    return true;
                }
            }
        }
        return false;
    }
    
    
}