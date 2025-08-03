import React, { useState } from 'react';
import BookDetails from './BookDetails.jsx';
import BlogDetails from './BlogDetails.jsx';
import CourseDetails from './CourseDetails.jsx';

const App = () => {
  const [view, setView] = useState('book'); // change this value for different views

  const renderComponent = () => {
    switch (view) {
      case 'book':
        return <BookDetails />;
      case 'blog':
        return <BlogDetails />;
      case 'course':
        return <CourseDetails />;
      default:
        return <div>Select a view</div>;
    }
  };

  return (
    <div>
      <button onClick={() => setView('book')}>Book</button>
      <button onClick={() => setView('blog')}>Blog</button>
      <button onClick={() => setView('course')}>Course</button>
      <hr />
      {renderComponent()}
    </div>
  );
};

export default App;
