package com.jdc.main;
public interface TrainerDAO{
    void addprogram(Program );
    void removeprogram(int Programcode);
    void editprogram(int Programcode);
    void approval(boolean );
}
