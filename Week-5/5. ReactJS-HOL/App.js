import React from 'react';
import CohortDetails from './Components/CohortDetails';

function App() {

  const cohorts = [
    {
      title: "React Development",
      trainer: "John",
      status: "ongoing",
      duration: "6 Weeks"
    },
    {
      title: "Java Full Stack",
      trainer: "David",
      status: "completed",
      duration: "8 Weeks"
    },
    {
      title: "Python Programming",
      trainer: "Smith",
      status: "ongoing",
      duration: "4 Weeks"
    },
    {
      title: "Data Science",
      trainer: "Robert",
      status: "completed",
      duration: "10 Weeks"
    }
  ];

  return (
    <div>

      <h1 style={{ textAlign: "center" }}>
        Cognizant Academy Dashboard
      </h1>

      {
        cohorts.map((cohort, index) => (
          <CohortDetails
            key={index}
            title={cohort.title}
            trainer={cohort.trainer}
            status={cohort.status}
            duration={cohort.duration}
          />
        ))
      }

    </div>
  );
}

export default App;