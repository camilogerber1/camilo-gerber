-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Jul 30, 2019 at 10:01 AM
-- Server version: 10.3.16-MariaDB

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";

-- Database: `high-school`
--

-- --------------------------------------------------------

--
-- Table structure for table `course`
--

CREATE TABLE `course` (
  `id` int(11) NOT NULL,
  `name` varchar(10) NOT NULL,
  `teacher` int(11) NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (`teacher`) REFERENCES `teacher` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `course`
--

INSERT INTO `course` (`id`, `name`, `teacher`) VALUES
(1, 'Math', 3),
(2, 'Physics', 2),
(3, 'Chemistry', 1);

-- --------------------------------------------------------

--
-- Table structure for table `days`
--

CREATE TABLE `days` (
  `id` int(11) NOT NULL,
  `name` varchar(10) NOT NULL,
    PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `days`
--

INSERT INTO `days` (`id`, `name`) VALUES
(1, 'Sunday'),
(2, 'Monday'),
(3, 'Tuesday'),
(4, 'Wednesday'),
(5, 'Thursday'),
(6, 'Friday'),
(7, 'Saturday');

-- --------------------------------------------------------

--
-- Table structure for table `notes`
--

CREATE TABLE `notes` (
  `id` int(11) NOT NULL,
  `par1` int(11) NOT NULL,
  `par2` int(11) NOT NULL,
  `par3` int(11) NOT NULL,
  `final` int(11) NOT NULL,
  `student` int(11) NOT NULL,
  `course` int(11) NOT NULL,
    PRIMARY KEY (id),
   FOREIGN KEY (`course`) REFERENCES `course` (`id`),
    FOREIGN KEY (`student`) REFERENCES `student` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `notes`
--

INSERT INTO `notes` (`id`, `par1`, `par2`, `par3`, `final`, `student`, `course`) VALUES
(4, 6, 4, 7, 4, 1, 1),
(5, 7, 4, 8, 9, 2, 1),
(6, 6, 5, 6, 4, 3, 1),
(7, 2, 5, 4, 4, 4, 1),
(8, 4, 4, 3, 4, 5, 1),
(9, 2, 5, 6, 4, 6, 1),
(10, 7, 4, 3, 8, 7, 1),
(11, 2, 4, 8, 7, 8, 1),
(12, 3, 4, 7, 3, 9, 1),
(13, 7, 5, 6, 9, 10, 1),
(14, 2, 5, 4, 7, 1, 2),
(15, 5, 4, 8, 7, 2, 2),
(16, 4, 6, 7, 9, 3, 2),
(17, 5, 5, 4, 2, 4, 2),
(18, 7, 5, 4, 7, 5, 2),
(19, 6, 6, 6, 4, 6, 2),
(20, 6, 5, 6, 8, 7, 2),
(21, 2, 5, 8, 8, 8, 2),
(22, 4, 5, 3, 7, 9, 2),
(23, 5, 4, 7, 9, 10, 2),
(24, 7, 6, 3, 8, 1, 3),
(25, 4, 5, 7, 4, 2, 3),
(26, 3, 6, 6, 5, 3, 3),
(27, 6, 4, 4, 9, 4, 3),
(28, 6, 6, 7, 4, 5, 3),
(29, 7, 6, 6, 4, 6, 3),
(30, 2, 6, 7, 7, 7, 3),
(31, 5, 4, 7, 7, 8, 3),
(32, 5, 5, 8, 4, 9, 3),
(33, 4, 5, 4, 7, 10, 3);

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `id` int(11) NOT NULL,
  `name` varchar(30) NOT NULL,
  `lastName` varchar(30) NOT NULL,
  `regNumber` int(11) NOT NULL,
  `birthDate` date NOT NULL,
    PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`id`, `name`, `lastName`, `regNumber`, `birthDate`) VALUES
(1, 'Bruno', 'Cabral', 0, '1996-04-05'),
(2, 'Matias', 'Olivera', 1, '1997-07-08'),
(3, 'Ignacio', 'Varas', 6, '1999-03-22'),
(4, 'Santiago', 'Andres', 25, '1990-11-12'),
(5, 'Pepito', 'Salinas', 324, '1994-04-06'),
(6, 'Sol', 'Perez', 2313, '1994-03-02'),
(7, 'Flor', 'De la V', 4234, '1989-05-22'),
(8, 'Juan Manuel', 'Belgrano', 1124, '1770-06-20'),
(9, 'Diego', 'Torres', 2424, '1980-03-05'),
(10, 'Katy', 'Perry', 1415, '1990-02-24');

-- --------------------------------------------------------

--
-- Table structure for table `teacher`
--

CREATE TABLE `teacher` (
  `id` int(11) NOT NULL,
  `name` varchar(30) NOT NULL,
  `lastName` varchar(30) NOT NULL,
  `birthDate` date NOT NULL,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `teacher`
--

INSERT INTO `teacher` (`id`, `name`, `lastName`, `birthDate`) VALUES
(1, 'Pedro', 'Sabugo', '1985-05-06'),
(2, 'Juan', 'Perez', '1980-02-03'),
(3, 'Armando', 'Banquitos', '1984-02-05');

-- --------------------------------------------------------

--
-- Table structure for table `weekSchedule`
--

CREATE TABLE `weekSchedule` (
  `id` int(11) NOT NULL,
  `course` int(11) NOT NULL,
  `startTime` time NOT NULL,
  `finishTime` time NOT NULL,
  `day` int(1) NOT NULL,
    PRIMARY KEY (id),
  FOREIGN KEY (`course`) REFERENCES `course` (`id`),
  FOREIGN KEY (`day`) REFERENCES `days` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `weekSchedule`
--

INSERT INTO `weekSchedule` (`id`, `course`, `startTime`, `finishTime`, `day`) VALUES
(2, 3, '15:00:00', '17:00:00', 2),
(3, 2, '16:00:00', '18:00:00', 3),
(4, 1, '14:00:00', '16:00:00', 4);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `course`
--
ALTER TABLE `course`
  ADD PRIMARY KEY (`id`),
  ADD KEY `teacher-relation` (`teacher`);


-- Indexes for table `notes`
--
ALTER TABLE `notes`
  ADD PRIMARY KEY (`id`),
  ADD KEY `courseRelation` (`course`),
  ADD KEY `studentRelation` (`student`);


-- Indexes for table `weekSchedule`
--
ALTER TABLE `weekSchedule`
  ADD PRIMARY KEY (`id`),
  ADD KEY `cRel` (`course`),
  ADD KEY `dayRel` (`day`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `course`
--
ALTER TABLE `course`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `days`
--
ALTER TABLE `days`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `notes`
--
ALTER TABLE `notes`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=34;

--
-- AUTO_INCREMENT for table `student`
--
ALTER TABLE `student`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `teacher`
--
ALTER TABLE `teacher`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `weekSchedule`
--
ALTER TABLE `weekSchedule`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;



/*QUERY 1 - List students and teachers for a given course.*/

select course.name as 'Course',
 concat(teacher.name, "  ", teacher.lastName) as 'Teacher',
 concat(student.name, "  ", student.lastName) as 'Students' 
 from course, student, teacher, notes
 where course.id = 1
 and course.teacher = teacher.id
 and notes.student = student.id
 and notes.course = course.id
 ORDER BY
 student.lastName 
 ASC;
 
 
/*QUERY 2 - Percentage of students that passed/failed a given course.*/
 
SET @courseNum = 1;

Select course.name as Course, concat((Count(IF(final < 6,1,null)) * 100 / (Select Count(IF(notes.course = @courseNum,1,null)) From notes)),'%') as Failed, 
concat((COUNT(IF(final >= 6, 1, null)) * 100 / (SELECT COUNT(IF(notes.course = @courseNum,1,null)) FROM notes)),'%') as Passed
From notes,course WHERE course = @courseNum and notes.course = course.id;

/*QUERY 3 - For a given teacher, list the timeline for each course that he is assigned to (ordered by date), and the course name. */

SELECT concat(teacher.name,' ',teacher.lastName) as Teacher, concat(days.name,' ',weekSchedule.startTime,' - ', weekSchedule.finishTime,': ',course.name) as Schedule from teacher, days, weekSchedule,course WHERE 
teacher.id = 1 and 
weekSchedule.day = days.id AND
weekSchedule.course = course.id AND
course.teacher = teacher.id
ORDER BY day;