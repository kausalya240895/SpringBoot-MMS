// Assuming you have a backend API to fetch data
const apiUrl = 'http://localhost:8080/api';

// Function to fetch conservation efforts data
async function fetchConservationEfforts() {
  try {
    const response = await fetch(`${apiUrl}/conservation-efforts`);
    const data = await response.json();
    return data;
  } catch (error) {
    console.error(error);
  }
}

// Function to display conservation efforts data
async function displayConservationEfforts() {
  const data = await fetchConservationEfforts();
  const tableBody = document.getElementById('conservation-efforts-body');
  data.forEach(effort => {
    const tableRow = document.createElement('tr');
    tableRow.innerHTML = `
      <td>${effort.id}</td>
      <td>${effort.project_name}</td>
      <td>${effort.location}</td>
      <td>${effort.goal}</td>
    `;
    tableBody.appendChild(tableRow);
  });
}

// Call the displayConservationEfforts function
//displayConservationEfforts();

// Function to fetch fishing regulations data
async function fetchFishingRegulations() {
    try {
        const response = await fetch(`${apiUrl}/fishing-regulations`);
        const data = await response.json();
        return data;
    } catch (error) {
        console.error(error);
    }
}

// Function to fetch marine life data
async function fetchMarineLife() {
    try {
        const response = await fetch(`${apiUrl}/marine-life`);
        const data = await response.json();
        return data;
    } catch (error) {
        console.error(error);
    }
}

// Function to fetch tour ship activities data
async function fetchTourShipActivities() {
    try {
        const response = await fetch(`${apiUrl}/tour-ship-activities`);
        const data = await response.json();
        return data;
    } catch (error) {
        console.error(error);
    }
}

// Function to render conservation efforts data
async function renderConservationEfforts() {
    const data = await fetchConservationEfforts();
    const tbody = document.getElementById('conservation-efforts-tbody');
    tbody.innerHTML = '';
    data.forEach((item) => {
        const row = document.createElement('tr');
        row.innerHTML = `
            <td>${item.id}</td>
            <td>${item.project_name}</td>
            <td>${item.location}</td>
            <td>${item.goal}</td>
        `;
        tbody.appendChild(row);
    });
}

// Function to render fishing regulations data
async function renderFishingRegulations() {
    const data = await fetchFishingRegulations();
    const tbody = document.getElementById('fishing-regulations-tbody');
    tbody.innerHTML = '';
    data.forEach((item) => {
        const row = document.createElement('tr');
        row.innerHTML = `
            <td>${item.id}</td>
            <td>${item.zone}</td>
            <td>${item.quota}</td>
            <td>${item.restriction}</td>
        `;
        tbody.appendChild(row);
    });
}

// Function to render marine life data
async function renderMarineLife() {
    const data = await fetchMarineLife();
    const tbody = document.getElementById('marine-life-tbody');
    tbody.innerHTML = '';
    data.forEach((item) => {
        const row = document.createElement('tr');
        row.innerHTML = `
            <td>${item.id}</td>
            <td>${item.species}</td>
            <td>${item.habitats}</td>
            <td>${item.population}</td>
        `;
        tbody.appendChild(row);
    });
}

// Function to render tour ship activities data
async function renderTourShipActivities() {
    const data = await fetchTourShipActivities();
    const tbody = document.getElementById('tour-ship-activities-tbody');
    tbody.innerHTML = '';
    data.forEach((item) => {
        const row = document.createElement('tr');
        row.innerHTML = `
            <td>${item.id}</td>
            <td>${item.location}</td>
            <td>${item.permit}</td>
            <td>${item.schedule}</td>
        `;
        tbody.appendChild(row);
    });
}

// Call the render functions
renderConservationEfforts();
renderFishingRegulations();
renderMarineLife();
renderTourShipActivities();

