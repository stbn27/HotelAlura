-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 22-04-2023 a las 18:09:57
-- Versión del servidor: 10.4.27-MariaDB
-- Versión de PHP: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `hotelalura`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `habitacion`
--

CREATE TABLE `habitacion` (
  `id` int(11) NOT NULL,
  `noHabitacion` int(11) NOT NULL,
  `inicio` date NOT NULL,
  `fin` date NOT NULL,
  `medioPago` varchar(20) NOT NULL,
  `estado` varchar(20) NOT NULL,
  `piso` int(11) NOT NULL,
  `id_huesped` int(11) NOT NULL,
  `costo` decimal(10,2) NOT NULL,
  `noReservacion` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `habitacion`
--

INSERT INTO `habitacion` (`id`, `noHabitacion`, `inicio`, `fin`, `medioPago`, `estado`, `piso`, `id_huesped`, `costo`, `noReservacion`) VALUES
(4, 101, '2023-04-20', '2023-04-22', 'Tarjeta de credito', 'Activo', 1, 22, '880.00', '101234'),
(5, 102, '2000-01-01', '2000-01-01', '-', 'Inactivo', 1, 0, '0.00', '0'),
(6, 103, '2000-01-01', '2000-01-01', '-', 'Inactivo', 1, 0, '0.00', '0'),
(7, 104, '2000-01-01', '2000-01-01', '-', 'Inactivo', 1, 0, '0.00', '0'),
(8, 105, '2000-01-01', '2000-01-01', '-', 'Inactivo', 1, 0, '0.00', '0'),
(9, 106, '2023-04-20', '2023-04-21', '-', 'Inactivo', 1, 0, '0.00', '0'),
(10, 107, '2023-04-19', '2023-04-29', '-', 'Inactivo', 1, 0, '0.00', '0'),
(11, 108, '2000-01-01', '2000-01-01', '-', 'Inactivo', 1, 0, '0.00', '0'),
(12, 109, '2000-01-01', '2000-01-01', '-', 'Mantenimiento', 1, 0, '0.00', '0'),
(13, 201, '2023-04-21', '2023-04-27', 'Tarjeta de credito', 'Inactivo', 2, 23, '2340.00', '0'),
(14, 202, '2000-01-01', '2000-01-01', '-', 'Inactivo', 2, 0, '0.00', '0'),
(15, 203, '2023-04-22', '2023-04-29', 'Tarjeta de debito', 'Activo', 2, 24, '2730.00', '203234'),
(16, 204, '2000-01-01', '2000-01-01', '-', 'Inactivo', 2, 0, '0.00', '0'),
(17, 205, '2000-01-01', '2000-01-01', '-', 'Inactivo', 2, 0, '0.00', '0'),
(18, 206, '2023-04-19', '2023-04-21', '-', 'Inactivo', 2, 0, '0.00', '0'),
(19, 207, '2000-01-01', '2000-01-01', '-', 'Inactivo', 2, 0, '0.00', '0'),
(20, 208, '2000-01-01', '2000-01-01', '-', 'Inactivo', 2, 0, '0.00', '0'),
(21, 209, '2000-01-01', '2000-01-01', '-', 'Inactivo', 2, 0, '0.00', '0'),
(22, 301, '2000-01-01', '2000-01-01', '-', 'Inactivo', 3, 0, '0.00', '0'),
(23, 302, '2000-01-01', '2000-01-01', '-', 'Inactivo', 3, 0, '0.00', '0'),
(24, 303, '2000-01-01', '2000-01-01', '-', 'Inactivo', 3, 0, '0.00', '0'),
(25, 304, '2000-01-01', '2000-01-01', '-', 'Inactivo', 3, 0, '0.00', '0'),
(26, 305, '2023-04-18', '2023-04-21', '-', 'Inactivo', 3, 0, '0.00', '0'),
(27, 306, '2023-04-21', '2023-04-29', 'Tarjeta de debito', 'Activo', 3, 25, '3120.00', '306234'),
(28, 307, '2000-01-01', '2000-01-01', '-', 'Inactivo', 3, 0, '0.00', '0'),
(29, 308, '2000-01-01', '2000-01-01', '-', 'Mantenimiento', 3, 0, '0.00', '0'),
(30, 309, '2000-01-01', '2000-01-01', '-', 'Inactivo', 3, 0, '0.00', '0'),
(31, 401, '2023-04-18', '2023-04-19', '-', 'Inactivo', 4, 0, '0.00', '0'),
(32, 402, '2000-01-01', '2000-01-01', '-', 'Inactivo', 4, 0, '0.00', '0'),
(33, 403, '2000-01-01', '2000-01-01', '-', 'Inactivo', 4, 0, '0.00', '0'),
(34, 404, '2023-04-19', '2023-04-22', '-', 'Inactivo', 4, 0, '0.00', '0'),
(35, 405, '2023-04-21', '2023-04-28', 'Tarjeta de credito', 'Activo', 4, 26, '2730.00', '405324'),
(36, 406, '2023-04-18', '2023-04-20', '-', 'Inactivo', 4, 0, '0.00', '0'),
(37, 407, '2000-01-01', '2000-01-01', '-', 'Inactivo', 4, 0, '0.00', '0'),
(38, 408, '2000-01-01', '2000-01-01', '-', 'Inactivo', 4, 0, '0.00', '0'),
(39, 409, '2000-01-01', '2000-01-01', '-', 'Inactivo', 4, 0, '0.00', '0'),
(40, 501, '2000-01-01', '2000-01-01', '-', 'Inactivo', 2, 0, '0.00', '0'),
(41, 502, '2000-01-01', '2000-01-01', '-', 'Inactivo', 5, 0, '0.00', '0'),
(42, 503, '2000-01-01', '2000-01-01', '-', 'Mantenimiento', 5, 0, '0.00', '0'),
(43, 504, '2000-01-01', '2000-01-01', '-', 'Inactivo', 5, 0, '0.00', '0'),
(45, 506, '2000-01-01', '2000-01-01', '-', 'Inactivo', 5, 0, '0.00', '0'),
(46, 507, '2000-01-01', '2000-01-01', '-', 'Inactivo', 5, 0, '0.00', '0'),
(47, 508, '2000-01-01', '2000-01-01', '-', 'Inactivo', 5, 0, '0.00', '0'),
(48, 509, '2023-04-19', '2023-04-22', '-', 'Inactivo', 5, 0, '0.00', '0'),
(49, 505, '2023-04-18', '2023-05-31', '-', 'Inactivo', 5, 0, '0.00', '0');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `huesped`
--

CREATE TABLE `huesped` (
  `id` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `apellido` varchar(100) NOT NULL,
  `nacimiento` date NOT NULL,
  `telefono` varchar(15) NOT NULL,
  `nacionalidad` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf32 COLLATE=utf32_unicode_ci;

--
-- Volcado de datos para la tabla `huesped`
--

INSERT INTO `huesped` (`id`, `nombre`, `apellido`, `nacimiento`, `telefono`, `nacionalidad`) VALUES
(22, 'José', 'Ortiz', '2002-07-27', '234-5678-7665', 'Mexicano'),
(24, 'Fernando', 'Ortiz', '1897-08-19', '2342342423', 'Mexicano'),
(25, 'Angel', 'Esteban', '2002-04-16', '23432432', 'Gambiano'),
(26, 'Jose', 'García', '1987-01-23', '3242354645', 'Jordano');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `setting`
--

CREATE TABLE `setting` (
  `id` int(11) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `razon` varchar(100) NOT NULL,
  `telefono` varchar(20) NOT NULL,
  `correo` varchar(20) NOT NULL,
  `ubicacion` varchar(50) NOT NULL,
  `actualizado_por` varchar(20) NOT NULL DEFAULT 'Sistema'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `setting`
--

INSERT INTO `setting` (`id`, `nombre`, `razon`, `telefono`, `correo`, `ubicacion`, `actualizado_por`) VALUES
(1, '\"Hotel Alura\"', 'Hoteles Alura Company S.A. de C.V.', '32-424234-98', 'hotelAlura@alura.com', '172, Me. de Deus - BA, 42600-000, Brasil', 'Sistema');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `id` int(11) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `correo` varchar(50) NOT NULL,
  `telefono` bigint(20) NOT NULL,
  `usuario` varchar(30) NOT NULL,
  `pass` varchar(40) NOT NULL,
  `rol` varchar(20) NOT NULL,
  `registrado_por` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='Tabla de registro de usuarios';

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`id`, `nombre`, `correo`, `telefono`, `usuario`, `pass`, `rol`, `registrado_por`) VALUES
(1, 'admin', 'admin', 1234567, 'admin', 'admin', 'Administrador', 'Sistema'),
(2, 'Jesus', 'hotelAlura@alura.com', 23432421, 'juan', '123', 'Trabajador', 'Sistema'),
(3, 'Jose', '5sdfsdf', 35543, 'jose', 'jose', 'Administrador', 'admin'),
(4, 'Jose', 'esteban@gmail.com', 23424, '123', '123', 'Trabajador', 'admin');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `habitacion`
--
ALTER TABLE `habitacion`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `huesped`
--
ALTER TABLE `huesped`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `setting`
--
ALTER TABLE `setting`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `habitacion`
--
ALTER TABLE `habitacion`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=50;

--
-- AUTO_INCREMENT de la tabla `huesped`
--
ALTER TABLE `huesped`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=27;

--
-- AUTO_INCREMENT de la tabla `setting`
--
ALTER TABLE `setting`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
