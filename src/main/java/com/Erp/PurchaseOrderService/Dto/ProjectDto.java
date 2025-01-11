package com.Erp.PurchaseOrderService.Dto;

import java.util.List;

public class ProjectDto {

    private String projectId;
    private String name;
    private String description;
    private String startDate;
    private String endDate;
    private String status;
    private String clientName;
    private Double budget;
    private List<String> requiredSkills;
    private Integer vacancies;
    private List<String> assignedEmployees;
    private String projectManagerId;

    // Getters and Setters

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public Double getBudget() {
        return budget;
    }

    public void setBudget(Double budget) {
        this.budget = budget;
    }

    public List<String> getRequiredSkills() {
        return requiredSkills;
    }

    public void setRequiredSkills(List<String> requiredSkills) {
        this.requiredSkills = requiredSkills;
    }

    public Integer getVacancies() {
        return vacancies;
    }

    public void setVacancies(Integer vacancies) {
        this.vacancies = vacancies;
    }

    public List<String> getAssignedEmployees() {
        return assignedEmployees;
    }

    public void setAssignedEmployees(List<String> assignedEmployees) {
        this.assignedEmployees = assignedEmployees;
    }

    public String getProjectManagerId() {
        return projectManagerId;
    }

    public void setProjectManagerId(String projectManagerId) {
        this.projectManagerId = projectManagerId;
    }

    // Constructors

    public ProjectDto(String projectId, String name, String description, String startDate, String endDate,
                      String status, String clientName, Double budget, List<String> requiredSkills,
                      Integer vacancies, List<String> assignedEmployees, String projectManagerId) {
        this.projectId = projectId;
        this.name = name;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
        this.clientName = clientName;
        this.budget = budget;
        this.requiredSkills = requiredSkills;
        this.vacancies = vacancies;
        this.assignedEmployees = assignedEmployees;
        this.projectManagerId = projectManagerId;
    }

    public ProjectDto() {
    }
}
