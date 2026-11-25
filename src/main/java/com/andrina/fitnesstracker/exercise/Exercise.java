package com.andrina.fitnesstracker.exercise;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

import java.util.List;

@Entity
@Table(name = "exercises")

public class Exercise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String exerciseId;
    private String name;
    private String gifUrl;

    // Collections to be mapped to PostgreSQL
    private List<String> bodyParts;
    private List<String> targetMuscles;
    private List<String> secondaryMuscles;
    private List<String> equipments;
    private List<String> instructions;
}
    /*
    public Exercise (String name, String gifUrl) {
        this.name = name;
        this.gifUrl = gifUrl;
     }
     
     public Exercise (List<String> bodyParts,
                     List<String> targetMuscles,
                     List<String> secondaryMuscles,
                     List<String> equipments,
                     List<String> instructions) {
        this.bodyParts = bodyParts;
        this.targetMuscles = targetMuscles;
        this.secondaryMuscles = secondaryMuscles;
        this.equipments = equipments;
        this.instructions = instructions;
        } */




/*
API field	Example	Java type to consider
exerciseId	"01qpYSe"	String
name	"upward facing dog"	String
gifUrl	A URL	String
bodyParts	["back"]	List<String>
equipments	["bodyweight"]	List<String>
targetMuscles	["erector spinae"]	List<String>
secondaryMuscles	["deltoids", "pectorals"]	List<String>
instructions	Multiple steps	List<String> */